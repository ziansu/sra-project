public java.lang.String displayContents() {
    java.lang.String contents = "";
    int index = 0;
    while (index < (size())) {
        T data = get(index);
        if (data != null) {
            contents = ((((contents + "[ ") + index) + " ]\t= ") + data) + "\n";
        }
        index++;
    } 
    return contents;
}