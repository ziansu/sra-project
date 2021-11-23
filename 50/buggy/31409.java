public void startSimulation() {
    com.kcl.keepitclean.main.session.SessionManager.getInstance().startSession();
    init();
    com.kcl.keepitclean.main.session.SessionManager.getInstance().addObserver(this);
    renderer.render();
    java.lang.System.out.println("<SimulatorEngine>Session Started");
}