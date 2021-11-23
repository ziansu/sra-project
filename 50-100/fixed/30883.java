@java.lang.Override
public void run() {
    while (running) {
        if ((cap) != null)
            cap.read(mat2image.mat);
        
        if ((cap) != null)
            frame.getContentPane().getGraphics().drawImage(mat2image.getImage(mat2image.mat), 0, 0, null);
        
        if ((cap) != null)
            frame.repaint();
        
    } 
}