public java.lang.String toString() {
    java.lang.String output;
    output = "Number of non-duplidate First objects: " + (countUniqueFirst());
    output += "\nTotal Number of First objects: " + (countAllFirst());
    output += "\nNumber of non-duplidate Second objects: " + (countUniqueSecond());
    output += "\nTotal Number of Second objects: " + (countAllSecond());
    return output;
}