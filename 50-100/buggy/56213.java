public void makeParkourList() {
    java.util.ArrayList<java.lang.String> blank = new java.util.ArrayList<java.lang.String>();
    parkourList = blank;
    for (java.lang.String key : data.getKeys(false)) {
        if (!((key.contains("spawn")) && ((data.getString((key + ".world"))) == null)))
            parkourList.add(key);
        
    }
}