public chemia.httpsgithub.comahyoung1.chemia.Element getElementBySymbol(java.lang.String elementSymbol) {
    for (int i = 0; i < 18; i++) {
        if (listOfElements[i].getChemSymbol().equals(elementSymbol)) {
            return listOfElements[i];
        }
    }
    return new chemia.httpsgithub.comahyoung1.chemia.Element("Couldn't find Element", (-1), "1", false, false);
}