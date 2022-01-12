public void componentResized(java.awt.event.ComponentEvent e) {
    if ((screensizeChangeBuffer) >= 5) {
        thegame.isnormalscreen = !(thegame.isnormalscreen);
        screensizeChangeBuffer = 0;
        if (!(thegame.isnormalscreen))
            frame.setSize(((int) (width)), ((int) (height)));
        else
            frame.setSize(1200, 675);
        
        java.lang.System.out.println("Window has ben resized, scaling accordingly");
    }
}