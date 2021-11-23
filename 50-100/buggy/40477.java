public static java.lang.String capitalizeSpacedLetters(java.lang.String str) {
    java.lang.String[] tokens = str.split("\\s");
    java.lang.String ret = "";
    for (java.lang.String t : tokens) {
        if (t.matches("(effer|gel|genital|glob|gran|gtt|emul|erw).*"))
            ret += (com.maxl.java.aips2sqlite.Utilities.capitalizeFirstLetter(t)) + " ";
        else
            if (t.matches("(kg|g|mg|mcg|ml|ie|e|mbq).*"))
                ret += t + " ";
            else
                ret += (com.maxl.java.aips2sqlite.Utilities.capitalizeFirstLetter(t)) + " ";
            
        
    }
    return ret.trim();
}