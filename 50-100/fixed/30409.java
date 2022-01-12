public java.lang.String toString() {
    if ((currentHolder) == null) {
        return super.toString();
    }else
        return ((((super.toString()) + ", ") + (currentHolder)) + ", ") + (dueDate);
    
}