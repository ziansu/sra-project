public java.lang.Thread newThread(java.lang.Runnable r) {
    java.lang.Thread t = new java.lang.Thread(new java.lang.ThreadGroup(m_groupName), r, (((((m_groupName) + "-") + (m_namePrefix)) + "-") + (m_threadNumber.getAndIncrement())));
    t.setDaemon(m_daemon);
    if ((t.getPriority()) != (java.lang.Thread.NORM_PRIORITY))
        t.setPriority(java.lang.Thread.NORM_PRIORITY);
    
    return t;
}