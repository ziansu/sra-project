public java.lang.String circulationStatus() {
    if ((getCurrentHolder().equals("null")) && (getDueDate().equals("null"))) {
        return "book available on shelves";
    }
    return (("checked out by: " + (getCurrentHolder())) + ", due: ") + (getDueDate());
}