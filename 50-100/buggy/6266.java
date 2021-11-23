protected void showing() {
    if ((this.stage) != null) {
        init();
        de.uniks.networkparser.ext.generic.ReflectionLoader.call("setTitle", this.stage, getTitle());
        try {
            de.uniks.networkparser.ext.generic.ReflectionLoader.call("show", this.stage);
        } catch (java.lang.Exception e) {
            errorHandler.saveException(e, this.stage);
            if (de.uniks.networkparser.ext.Os.isEclipse()) {
                throw e;
            }
        }
    }
}