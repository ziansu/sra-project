private boolean contains(java.lang.String[] newList, java.lang.String oldkey) {
    for (java.lang.String s : newList)
        if (oldkey.equals(s))
            return true;
        
    
    return false;
}