public void addInfoIntoHopObject() {
    if (checkCurrentTag("hopsName")) {
        hop.setNameOfHop(text);
    }else
        if (checkCurrentTag("hopsamount")) {
            hop.setAmountOfHopsInGrams(text);
        }else
            if (checkCurrentTag("hopstime")) {
                hop.setTimeToAddHop(text);
            }
        
    
}