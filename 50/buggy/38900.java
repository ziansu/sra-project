public void removeCurrentProcess() {
    sos.SOS.debugPrintln(("removed process: " + (m_currProcess.getProcessId())));
    m_processes.remove(m_currProcess);
    scheduleNewProcess();
}