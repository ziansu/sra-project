@java.lang.Override
public void run() {
    try {
        de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().newProject();
        initProjectGUI();
    } catch (java.lang.RuntimeException e) {
        java.lang.System.out.println("EXCEPTION DURING PROJECT CREATION");
        de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().closeProject();
        throw e;
    }
}