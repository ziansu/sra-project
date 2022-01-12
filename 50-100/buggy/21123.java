@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    java.awt.Dimension size = this.getSize();
    java.lang.System.out.println(((("Size: " + (size.width)) + " ") + (size.height)));
    if ((size.width) != (size.height)) {
        int d = java.lang.Math.min(size.width, size.height);
        setSize(d, d);
        setPreferredSize(new java.awt.Dimension(d, d));
    }
}