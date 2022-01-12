@java.lang.Override
public void run() {
    while (running) {
        cap.read(mat2image.mat);
        frame.getContentPane().getGraphics().drawImage(mat2image.getImage(mat2image.mat), 0, 0, null);
        frame.repaint();
    } 
}