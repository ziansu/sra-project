@java.lang.Override
public java.awt.Dimension getPreferredSize() {
    if ((image) == null)
        return super.getPreferredSize();
    else
        return new java.awt.Dimension(image.getWidth(null), image.getHeight(null));
    
}