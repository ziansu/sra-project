@java.lang.Override
public java.awt.Dimension getPreferredSize() {
    java.awt.Dimension d = super.getPreferredSize();
    if ((this.thumbDim) != null)
        d.height = this.thumbDim.height;
    
    return d;
}