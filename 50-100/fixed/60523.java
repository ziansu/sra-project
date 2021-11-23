@org.junit.Before
public void setUp() throws java.lang.Exception {
    if (java.awt.GraphicsEnvironment.isHeadless())
        return ;
    
    frame = new javax.swing.JFrame("test");
    canvas = new javax.media.opengl.awt.GLCanvas(new javax.media.opengl.GLCapabilities(javax.media.opengl.GLProfile.getGL2GL3()));
    frame.getContentPane().add(canvas);
    frame.setSize(640, 480);
    frame.setVisible(true);
    canvas.setRealized(true);
}