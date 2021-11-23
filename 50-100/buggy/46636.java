public void tasksInProjectEnthalten(int projectId) {
    java.lang.System.out.println((("Projekt: " + (getProjectById(projectId).getProjectBezeichnung())) + ". Enthält Aufgaben:"));
    for (Logic.Aufgabe a : aufgaben) {
        if ((a.getProjectId()) == projectId) {
            a.printAufgabeShort();
        }
    }
}