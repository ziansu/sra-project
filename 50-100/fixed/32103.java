public boolean isLegit(java.lang.String name, java.lang.String host) {
    java.lang.String[] nameSeperated = name.split(" ");
    if (((host.equals("")) || (name.equals(""))) || ((nameSeperated.length) > 1))
        return false;
    else
        return true;
    
}