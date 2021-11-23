@java.lang.Override
public void stop() throws java.lang.Exception {
    java.lang.System.out.println("-- stop()");
    java.lang.System.out.println("Stopping application, saving config");
    config.pos_x = mainStage.getX();
    config.pos_y = mainStage.getY();
    config.width = mainStage.getWidth();
    config.height = mainStage.getHeight();
    org.szernex.java.jtwitchuserlistgrabber.Config.save(config, java.nio.file.Paths.get(R.CONFIG_FILE));
}