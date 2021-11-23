public static void main(java.lang.String[] args) {
    int iterations = 2000;
    BattleSettingsSet BSS = UI.SingleSet();
    ParameterRig PR = new ParameterRig(BSS, UI.getMCQTable(iterations, BSS));
    PR.runMonteCarlo();
    PR.runLookupTable();
    PR.runNeuralNet();
    PR.runTDLookupTable();
    PR.runTDNeuralNet();
}