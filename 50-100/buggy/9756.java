@java.lang.Override
public void run() {
    try {
        java.lang.String line = in.readLine();
        java.lang.System.out.println(("Text received: " + line));
        map = new caffeine.world.Map(line);
        gui.getContentPane().setCurrentMap(map);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Read failed");
        java.lang.System.exit(1);
    }
    gui.repaint();
}