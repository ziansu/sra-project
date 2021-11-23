public java.lang.String getShortDescription() {
    java.lang.String[] strings = descrizione.split(" ");
    java.lang.String sho = "";
    int count = 20;
    for (java.lang.String s : strings) {
        if (count < 0) {
            sho += "...";
            break;
        }else
            sho += s + " ";
        
        count--;
    }
    sho += "...";
    return sho;
}