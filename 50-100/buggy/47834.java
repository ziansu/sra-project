public static long[] getCountDistribution(edu.indiana.soic.spidal.damds.timing.TemperatureLoopTimings.TimingTask task) throws mpi.MPIException {
    java.nio.LongBuffer mpiOnlyTimingBuffer = edu.indiana.soic.spidal.damds.ParallelOps.mpiOnlyBuffer;
    mpiOnlyTimingBuffer.position(0);
    switch (task) {
        case PRE_STRESS :
            mpiOnlyTimingBuffer.put(edu.indiana.soic.spidal.damds.timing.TemperatureLoopTimings.countPreStress);
        case STRESS_LOOP :
            mpiOnlyTimingBuffer.put(edu.indiana.soic.spidal.damds.timing.TemperatureLoopTimings.countStressLoop);
    }
    long[] mpiOnlyTimingArray = new long[edu.indiana.soic.spidal.damds.ParallelOps.procCount];
    edu.indiana.soic.spidal.damds.ParallelOps.gather(mpiOnlyTimingBuffer, 1, 0);
    mpiOnlyTimingBuffer.position(0);
    mpiOnlyTimingBuffer.get(mpiOnlyTimingArray);
    return mpiOnlyTimingArray;
}