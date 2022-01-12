private int getFileExtension() {
    java.lang.String[] splitted = filePath.split(".");
    java.lang.String ext = splitted[((splitted.length) - 1)];
    if (ext.equals("xhtml"))
        return XHTML;
    else
        if (ext.equals("css"))
            return CSS;
        else
            if (ext.equals("svg"))
                return SVG;
            else
                return 0;
            
        
    
}