public java.lang.String toString() {
    java.lang.String str = "";
    if ((getPID()) > 0) {
        str += ("[" + (getPID())) + "] ";
    }
    str += name;
    if ((readAssignmentMode) != (Document.ReadAssignmentMode.readCount))
        str += (" [" + (readAssignmentMode.toString())) + "]";
    
    return str;
}