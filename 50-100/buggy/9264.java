private java.util.Properties read(java.io.File f) throws java.io.IOException {
    if (!(f.exists()))
        return new java.util.Properties();
    
    java.util.Properties prop = new java.util.Properties();
    java.io.FileInputStream stream = new java.io.FileInputStream(f);
    prop.load(stream);
    return prop;
}