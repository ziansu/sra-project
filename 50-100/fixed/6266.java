protected void showing() {
    if ((this.stage) != null) {
        init();
        de.uniks.networkparser.ext.generic.ReflectionLoader.call("setTitle", this.stage, getTitle());
        if (de.uniks.networkparser.ext.Os.isEclipse()) {
            de.uniks.networkparser.ext.generic.ReflectionLoader.call("show", this.stage);
        }else {
            try {
                de.uniks.networkparser.ext.generic.ReflectionLoader.call("show", this.stage);
            } catch (java.lang.Exception e) {
                errorHandler.saveException(e, this.stage);
            }
        }
    }
}