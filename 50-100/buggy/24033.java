private void runSync() {
    java.lang.System.out.println("Synching");
    if (synching)
        try {
            sync();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    
    java.util.Timer t = new java.util.Timer();
    t.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            runSync();
        }
    }, uk.ac.shef.dcs.oak.electro.Model.TIME);
}