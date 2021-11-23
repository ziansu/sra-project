public java.lang.String favoritesToString() {
    java.lang.String toString = "";
    int index = 1;
    for (int number : favorites) {
        if (number > 0)
            toString += ((index + ". ") + (getContact(number).getName())) + "\n";
        
    }
    return toString;
}