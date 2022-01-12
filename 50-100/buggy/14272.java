public void start() {
    try {
        tomcat.start();
        com.kirinpatel.util.Debug.Log("Tomcat server started.", 4);
    } catch (org.apache.catalina.LifecycleException e) {
        com.kirinpatel.util.Debug.Log("Unable to start tomcat started.", 5);
    }
    tomcat.getServer().await();
    com.kirinpatel.util.PortValidator.isAvailable(8080);
}