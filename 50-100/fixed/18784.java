public static java.lang.String[] getOutputs(float[] inputs, int child) {
    float[] midput = me.hii488.shooterAI.GeneticAlgorithm.recurrentOutput(inputs, child, 0);
    java.lang.String[] s = new java.lang.String[GeneralVars.outputs.length];
    int count = 0;
    for (int i = 0; i < (GeneralVars.outputs.length); i++) {
        if ((midput[i]) == 1) {
            s[count] = GeneralVars.outputs[i];
            count++;
        }
    }
    return s;
}