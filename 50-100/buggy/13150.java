public void setElements(java.lang.String regularExp, java.lang.String charEscape) {
    int pointerToRegExPosition = this.position;
    while (pointerToRegExPosition < (this.endPosition)) {
        java.lang.String element = java.lang.String.valueOf(regularExp.charAt(pointerToRegExPosition));
        if (element.equals(charEscape)) {
            pointerToRegExPosition++;
            element = java.lang.String.valueOf(regularExp.charAt(pointerToRegExPosition));
        }
        listOfElements.add(element);
        pointerToRegExPosition++;
    } 
}