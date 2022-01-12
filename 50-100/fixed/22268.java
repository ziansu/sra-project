public java.lang.String getSelectedTag() {
    if ((keywords.size()) == 0)
        return null;
    else
        if (keywords.get(0).substring(0, 2).equals("t/"))
            return ("[" + (keywords.get(0).substring(2))) + "]";
        else
            return null;
        
    
}