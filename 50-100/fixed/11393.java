public void set(java.lang.String path, java.lang.Object value, java.lang.String comment) {
    if (!(this.config.contains(path))) {
        this.config.set((((manager.getPluginName()) + "_COMMENT_") + (comments)), comment);
        (comments)++;
    }
    this.config.set(path, value);
}