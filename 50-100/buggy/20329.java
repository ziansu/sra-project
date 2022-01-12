public chemia.httpsgithub.comahyoung1.chemia.Element getElementByName(java.lang.String elementName) {
    for (int i = 0; i < 18; i++) {
        if (listOfElements[i].getName().equals(elementName)) {
            return listOfElements[i];
        }
    }
    return new chemia.httpsgithub.comahyoung1.chemia.Element("Couldn't find Element", (-1), "1", false, false);
}