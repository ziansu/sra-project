public static java.lang.String[] getOutputs(float[] inputs, int child) {
    float[] midput = me.hii488.shooterAI.GeneticAlgorithm.recurrentOutput(inputs, child, 1);
    java.lang.String[] s = new java.lang.String[]{  };
    for (int i = 0; i < (GeneralVars.outputs.length); i++) {
        if ((midput[i]) == 1) {
            s[s.length] = GeneralVars.outputs[i];
        }
    }
    return s;
}