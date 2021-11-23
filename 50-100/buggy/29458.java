public void printSingleSolutionToOutput(org.intervarsity.Solution sol) {
    sol.findAllMembers(schedules, org.intervarsity.BibleStudySchedulerWindow.blockSize);
    java.util.ArrayList<org.intervarsity.Session> sessions = sol.getSessions();
    for (org.intervarsity.Session s : sessions) {
        java.util.ArrayList<org.intervarsity.Schedule> must = s.membersMustAttend;
        java.util.ArrayList<org.intervarsity.Schedule> can = s.members;
        textSolutionOutput.append(((times[s.time]) + ":\n"));
        textSolutionOutput.append(s.toString());
        s.printMustAttend();
    }
}