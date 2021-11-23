public void run() {
    if (((this.getMappingsLocation()) != null) && ((this.getSrcLocation()) != null)) {
        this.sendToConsole((((("Preparing to apply mappings to '" + (this.getSrcLocation())) + "' from '") + (this.getMappingsLocation())) + "'"));
        (remapper = new com.arisux.mappingpatcher.Remapper(this)).start();
    }
}