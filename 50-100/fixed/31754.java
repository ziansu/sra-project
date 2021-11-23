private com.wexflow.Workflow doInBackground(java.lang.Boolean force) {
    try {
        this.force = force;
        return this.client.getWorkflow(this.activity.getWorkflowId());
    } catch (java.lang.Exception e) {
        this.exception = e;
        return null;
    }
}