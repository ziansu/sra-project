public static void main(java.lang.String[] args) {
    SolverGUI.objectname = new SolverGUI();
    try {
        SolverGUI.myString[1] = args[1];
    } catch (java.lang.Exception e) {
        SolverGUI.myString[1] = "medium";
    }
    try {
        SolverGUI.myString[2] = args[2];
        SolverGUI.myString[3] = args[3];
    } catch (java.lang.Exception e) {
    } finally {
    }
}