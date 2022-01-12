public void addJointJerkRegularization() {
    for (int i = 0; i < (numberOfDoFs); i++) {
        solverInput_H.add(i, i, jointJerkRegularization.getDoubleValue());
        solverInput_f.add(i, 0, ((-(jointJerkRegularization.getDoubleValue())) * (solverOutput_jointAccelerations.get(i, 0))));
    }
}