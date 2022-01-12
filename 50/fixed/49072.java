@java.lang.Override
public org.sosy_lab.cpachecker.core.algorithm.AlgorithmStatus run(org.sosy_lab.cpachecker.core.reachedset.ReachedSet pReached) throws java.lang.InterruptedException, org.sosy_lab.cpachecker.exceptions.CPAException {
    org.sosy_lab.cpachecker.core.algorithm.AlgorithmStatus sound = AlgorithmStatus.SOUND_AND_PRECISE;
    sound = sound.update(innerAlgorithm.run(pReached));
    postProcessor.postProcess(pReached);
    return sound;
}