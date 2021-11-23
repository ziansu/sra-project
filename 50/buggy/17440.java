@java.lang.Override
public java.lang.Object getPixels(int n) {
    ij.process.ImageProcessor ip = getProcessor(n);
    if (ip != null)
        return ip.getPixels();
    else
        return null;
    
}