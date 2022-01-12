private java.awt.Dimension autoContentsFitSize() {
    if ((this.preferredWidth) != (-1)) {
        flatAutoResizeListener.setContentsFitSize(preferredWidth, true);
    }else {
        flatAutoResizeListener.setContentsFitSize();
    }
    return flatAutoResizeListener.getPreferredSize();
}