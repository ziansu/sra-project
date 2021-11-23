private void syscallExit() {
    m_processes.remove(m_currProcess);
    scheduleNewProcess();
}