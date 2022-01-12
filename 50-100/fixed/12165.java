public void setTemperature(java.lang.String h) {
    strTemperature = h;
    if (h != null) {
        int i = strTemperature.indexOf('.');
        i = java.lang.Integer.parseInt(strTemperature.substring(0, i));
        if (i > (maxTemp))
            maxTemp = ((byte) (i));
        
    }
}