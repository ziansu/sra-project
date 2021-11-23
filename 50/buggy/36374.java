@java.lang.Override
protected java.util.List<com.wexflow.Workflow> doInBackground(java.lang.String... params) {
    try {
        return this.client.getWorkflows();
    } catch (java.lang.Exception e) {
        this.exception = e;
        return null;
    }
}