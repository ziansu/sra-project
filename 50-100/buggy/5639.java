public void addInfoIntoHopObject() {
    if (checkCurrentTag("hopsName")) {
        hop.setNameOfHop(text);
    }else
        if (checkCurrentTag("hopsamount")) {
            hop.setAmountOfHopsInGrams(java.lang.Double.parseDouble(text));
        }else
            if (checkCurrentTag("hopstime")) {
                hop.setTimeToAddHop(text);
            }
        
    
}