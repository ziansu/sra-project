public void setWeights(org.ejml.data.DenseMatrix64F weight) {
    for (int i = 0; i < (us.ihmc.robotics.screwTheory.SpatialAccelerationVector.SIZE); i++) {
        weightVector.set(i, 0, weight.get(i, 0));
        hasWeight = ((weight.get(i, 0)) != (us.ihmc.commonWalkingControlModules.controllerCore.command.SolverWeightLevels.HARD_CONSTRAINT)) && (hasWeight);
    }
}