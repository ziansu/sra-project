private void interactive() {
    java.lang.System.out.println();
    try {
        this.questionTargetDirectory();
        this.questionResultFile();
        this.questionRandomData();
        this.questionContextId();
        this.questionContentModelId();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}