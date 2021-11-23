@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent windowEvent) {
    try {
        project.BankingSystem.dbaccess.open();
        project.BankingSystem.dbaccess.runUpdate((("delete from Sessions where sessionID=" + (project.BankingSystem.sessionID)) + ";"));
        project.BankingSystem.dbaccess.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace(java.lang.System.out);
    }
    java.lang.System.exit(0);
}