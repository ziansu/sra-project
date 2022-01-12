public java.lang.String generateProlog() {
    int numStates = stateTable.size();
    prologProgram += plproject3.GenerateProlog.acceptStatesHeader;
    prologProgram += generateAcceptStates();
    prologProgram += ("\n\n" + (plproject3.GenerateProlog.rulesHeader)) + "\n";
    prologProgram += generateStartRule();
    for (int i = 0; i < numStates; i++) {
        prologProgram += generateStateData(i);
        prologProgram += generateStateHeader(i);
        prologProgram += getTransitions(stateTable.get(0), i);
    }
    java.lang.System.out.println(prologProgram);
    return prologProgram;
}