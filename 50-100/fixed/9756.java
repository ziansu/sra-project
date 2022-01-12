@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.String line = in.readLine();
            map = new caffeine.world.Map(line);
            gui.getContentPane().setCurrentMap(map);
        } catch (java.io.IOException e) {
            java.lang.System.out.println("Read failed");
            java.lang.System.exit(1);
        }
        gui.repaint();
    } 
}