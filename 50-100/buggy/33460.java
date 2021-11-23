public void send_file(java.io.File file) throws java.io.IOException, java.security.InvalidParameterException {
    if (!(file.exists()))
        throw new java.io.FileNotFoundException("File does not exist");
    
    if (!(file.isFile()))
        throw new java.security.InvalidParameterException("Parameter must be a file");
    
    if ((file.length()) > (java.lang.Integer.MAX_VALUE))
        multi_stage_send(file);
    else
        single_stage_send(file);
    
    fis.close();
}