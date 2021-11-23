private java.lang.String parametersToString() {
    java.lang.StringBuilder returnString = new java.lang.StringBuilder();
    for (java.util.Iterator<java.lang.String> iterator = parameters.iterator(); iterator.hasNext();) {
        returnString.append("\'").append(iterator.next()).append("\'");
        if (iterator.hasNext())
            returnString.append(", ");
        
    }
    return returnString.toString();
}