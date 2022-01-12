public int getScaleQual() {
    digilib.image.ImageJobDescription.logger.debug("get_scaleQual()");
    int qual = dlConfig.getAsInt("default-quality");
    if (hasOption("q0"))
        qual = 0;
    else
        if (hasOption("q1"))
            qual = 1;
        else
            if (hasOption("q2"))
                qual = 2;
            
        
    
    return qual;
}