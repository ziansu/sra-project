public void reset() {
    for (int i = 0; i < (numberOfDoFs); i++)
        regularizationMatrix.set(i, i, jointAccelerationRegularization.getDoubleValue());
    
    solverInput_H.zero();
    solverInput_f.zero();
    solverInput_Aeq.reshape(0, problemSize);
    solverInput_beq.reshape(0, 0);
    if (!(firstCall.getBooleanValue()))
        addJointJerkRegularization();
    
}