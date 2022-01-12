private void loadResources() throws java.lang.Exception {
    for (java.lang.String name : this.defs.keySet()) {
        try {
            autorest.generator.Resource res = new autorest.generator.Resource(name, this.defs.get(name).clone(), this);
            this.resources.put(name, res);
        } catch (java.lang.Exception e) {
            throw new java.lang.Exception((("Exception while loading [" + name) + "] in the PFSHandler processor. "), e);
        }
    }
}