public void setMax_mem(java.lang.String max_mem) {
    org.kevoree.docker.containerDriver.core.cgroupDriver.MemoryDriver.setMaxMemValue(this.getId(), max_mem);
    this.max_mem = max_mem;
}