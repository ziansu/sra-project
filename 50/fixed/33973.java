public java.lang.String circulationStatus() {
    if ((currentHolder) == null) {
        return "book available on shelves";
    }else
        return ((currentHolder) + "    due: ") + (dueDate);
    
}