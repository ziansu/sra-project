public void printSingleSolutionToOutput(org.intervarsity.Solution sol) {
    java.util.ArrayList<org.intervarsity.Session> sessions = sol.getSessions();
    for (org.intervarsity.Session s : sessions) {
        textSolutionOutput.append(((times[s.time]) + ":\n"));
        textSolutionOutput.append(s.toString());
    }
}