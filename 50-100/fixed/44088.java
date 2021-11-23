private void dnf() {
    if (!(running)) {
        cmd_error("System not running.");
        return ;
    }
    if ((m_state) != (Chrono.Controller.ChronoState.RACING)) {
        cmd_error("A Run is not in progress, must start a Run first.");
        return ;
    }
    int number = m_run.dnf();
    if (number > 0)
        java.lang.System.out.println(("Racer DNF: " + number));
    
}