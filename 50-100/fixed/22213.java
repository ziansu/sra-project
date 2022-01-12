@java.lang.Override
public void run() {
    while (true) {
        while ((robotQueryQueue.isEmpty()) || ((this.getConnectionState()) != (geist.re.mindlib.RobotService.CONN_STATE_CONNECTED))) {
            synchronized(this) {
                try {
                    wait();
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } 
        geist.re.mindlib.tasks.RobotQueryTask rqt = robotQueryQueue.poll();
        rqt.execute(this);
    } 
}