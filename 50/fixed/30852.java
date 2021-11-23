public java.lang.String getCipherMode() {
    java.lang.String[] split = cipherName.split("/", 2);
    if ((split.length) < 2)
        return null;
    
    return split[1];
}