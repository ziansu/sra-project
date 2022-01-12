@java.lang.Override
public java.awt.Dimension getPreferredSize() {
    java.awt.Dimension d = super.getPreferredSize();
    if ((this.thumbDim) != null)
        d.width = this.thumbDim.width;
    
    return d;
}