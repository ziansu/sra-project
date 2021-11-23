private java.util.ArrayList<java.util.List> parseXML() {
    java.util.ArrayList<java.util.List> parsedInformation = new java.util.ArrayList<java.util.List>();
    for (java.lang.String temp : myPaths) {
        org.jdom.xpath.XPath currentPath;
        try {
            currentPath = org.jdom.xpath.XPath.newInstance(temp);
            java.util.List listToAdd = currentPath.selectNodes(myDocument);
            parsedInformation.add(listToAdd);
        } catch (org.jdom.JDOMException e) {
            e.printStackTrace();
        }
    }
    return parsedInformation;
}