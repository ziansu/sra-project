public void removeCurrentProcess() {
    freeCurrProcessMemBlock();
    m_processes.remove(m_currProcess);
}