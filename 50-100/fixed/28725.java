public java.lang.String circulationStatus() {
    if (((getCurrentHolder()) == null) && ((getDueDate()) == null)) {
        return "book available on shelves";
    }
    return (("checked out by: " + (getCurrentHolder())) + ", due: ") + (getDueDate());
}