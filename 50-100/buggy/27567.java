private java.lang.String parametersToString() {
    java.lang.String returnString = "";
    for (java.util.Iterator<java.lang.String> iterator = parameters.iterator(); iterator.hasNext();) {
        returnString += ("\'" + (iterator.next())) + "\'";
        if (iterator.hasNext())
            returnString += ", ";
        
    }
    return returnString;
}