public void setWeights(org.ejml.data.DenseMatrix64F weight) {
    hasWeight = true;
    for (int i = 0; i < 3; i++) {
        weightVector.set(i, 0, weight.get(i, 0));
        if ((weight.get(i, 0)) == (us.ihmc.commonWalkingControlModules.controllerCore.command.SolverWeightLevels.HARD_CONSTRAINT))
            hasWeight = false;
        
    }
}