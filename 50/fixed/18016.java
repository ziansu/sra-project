public void save(java.io.Writer writer) {
    this.xstream.toXML(this.pipeline, writer);
    saveIsDirty.set(false);
}