public void run() {
    this.thread = new ai.vital.cytoscape.app.internal.tasks.ExpandNodesTask.ExpansionThread();
    thread.start();
    while (thread.isAlive()) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}