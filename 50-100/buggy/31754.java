@java.lang.Override
protected com.wexflow.Workflow doInBackground(java.lang.Boolean... params) {
    try {
        this.force = params[0];
        return this.client.getWorkflow(this.activity.getWorkflowId());
    } catch (java.lang.Exception e) {
        this.exception = e;
        return null;
    }
}