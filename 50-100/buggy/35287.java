private boolean checkDuplicateAbstract(java.lang.String newTitle) {
    int i = 0;
    java.lang.String title = newTitle.toLowerCase();
    java.lang.System.out.println((title + "Lower case????"));
    while (i < (titlesIndex)) {
        if (titles[i].equals(title)) {
            java.lang.System.out.println("duplicate found");
            (dupCount)++;
            return true;
        }
        i++;
    } 
    java.lang.System.out.println((title + "-----NOT DUPLICATE"));
    titles[titlesIndex] = title;
    (titlesIndex)++;
    return false;
}