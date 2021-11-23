public java.lang.String toString() {
    java.lang.String save = "[";
    while ((peekFirst()) != null) {
        save += pollFirst();
        if ((peekFirst()) != null) {
            save += ",";
        }
    } 
    save += "]";
    return save;
}