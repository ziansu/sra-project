public void setMemoryName(java.lang.String name) {
    if ((name == null) || (name.equals(""))) {
        namedMemory = null;
        memoryName = "";
        return ;
    }
    memoryName = name;
    jmri.Memory memory = jmri.jmri.InstanceManager.memoryManagerInstance().getMemory(name);
    if (memory != null) {
        namedMemory = jmri.jmri.InstanceManager.getDefault(jmri.NamedBeanHandleManager.class).getNamedBeanHandle(name, memory);
    }
}