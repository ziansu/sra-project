public void setMaxScaledSize(java.awt.Dimension inMaxScaledSize) {
    if (inMaxScaledSize != null) {
        setProperty("prefwidth", inMaxScaledSize.width);
        setProperty("prefheight", inMaxScaledSize.height);
    }
}