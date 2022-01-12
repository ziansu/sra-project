private java.util.List<com.wexflow.Workflow> doInBackground() {
    try {
        return this.client.getWorkflows();
    } catch (java.lang.Exception e) {
        this.exception = e;
        return null;
    }
}