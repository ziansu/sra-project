private void process() {
    int type = image.getType();
    if (type == (ij.ImagePlus.GRAY8)) {
        rChannel = gChannel = bChannel = image;
        Spheroid_RGB.PEAKS_COLOR = java.awt.Color.RED;
    }else
        if (type == (ij.ImagePlus.GRAY16))
            ij.IJ.showMessage("16-bit gray scale image not supported");
        else
            if (type == (ij.ImagePlus.GRAY32))
                ij.IJ.showMessage("32-bit gray scale image not supported");
            else
                if (type == (ij.ImagePlus.COLOR_RGB)) {
                    splitChannels(image);
                }else {
                    ij.IJ.showMessage("not supported");
                }
            
        
    
}