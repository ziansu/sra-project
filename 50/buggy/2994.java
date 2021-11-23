private void syscallExit() {
    sos.SOS.debugPrintln(((("Removing process with id " + (m_currProcess.getProcessId())) + " at ") + (m_CPU.getBASE())));
    m_processes.remove(m_currProcess);
    scheduleNewProcess();
}