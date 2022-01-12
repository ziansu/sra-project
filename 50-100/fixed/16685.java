public static void RefreshWindow() {
    de.NabTrap.PhySIX.Engine.Display.Display.GFrame.setTitle(de.NabTrap.PhySIX.Engine.Display.Display.title);
    if ((de.NabTrap.PhySIX.Engine.Display.Display.Icon) != null)
        de.NabTrap.PhySIX.Engine.Display.Display.GFrame.setIconImage(de.NabTrap.PhySIX.Engine.Display.Display.Icon);
    
    de.NabTrap.PhySIX.Engine.Display.Display.GFrame.setSize(de.NabTrap.PhySIX.Engine.Display.Display.WIDTH, de.NabTrap.PhySIX.Engine.Display.Display.HEIGHT);
    de.NabTrap.PhySIX.Engine.Display.Display.GFrame.setResizable(false);
    de.NabTrap.PhySIX.Engine.Display.Display.GFrame.setLocationRelativeTo(null);
    de.NabTrap.PhySIX.Engine.Display.Display.GFrame.createBufferStrategy(de.NabTrap.PhySIX.Engine.Display.Display.Buffers);
    de.NabTrap.PhySIX.Engine.Display.Display.GFrame.setDefaultCloseOperation(de.NabTrap.PhySIX.Engine.Display.Display.CloseOperation);
}