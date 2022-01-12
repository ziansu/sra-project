public java.lang.String displayContents() {
    java.lang.String contents = "";
    crazycalculator.datastructure.Link<T> currentLink = firstLink;
    int index = 0;
    while ((currentLink.getData()) != null) {
        contents = ((((contents + "[ ") + index) + " ]\t= ") + (currentLink.getData())) + "\n";
        index++;
        currentLink = currentLink.getNextLink();
    } 
    return contents;
}