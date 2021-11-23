public void setType(java.lang.String type) {
    this.type = type;
    if ("replicated".equals(type)) {
        replicated = new org.voovan.docker.message.service.atom.mode.Replicated();
        global = null;
    }else
        if ("Global".equals(type)) {
            replicated = null;
            global = new org.voovan.docker.message.service.atom.mode.Global();
        }
    
}