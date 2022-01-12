@java.lang.Override
protected void executing() {
    com.vainolo.phd.opp.interpreter.OPPObjectInstance prompt = getArgument(com.vainolo.phd.opp.interpreter.builtin.OPPConsoleInputProcessInstance.PROMPT_PARAM_NAME);
    if (prompt != null)
        java.lang.System.out.println(prompt);
    
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    java.lang.String input = "";
    try {
        input = br.readLine();
        if (input != null) {
            com.vainolo.phd.opp.interpreter.OPPObjectInstance instance = valueAnalyzer.calculateOPMObjectValue(input);
            setArgument(com.vainolo.phd.opp.interpreter.builtin.OPPConsoleInputProcessInstance.INPUT_PARAM_NAME, instance);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}