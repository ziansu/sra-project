public java.lang.String toString() {
    if ((currentHolder.compareTo("")) == 0) {
        return super.toString();
    }else
        return ((((super.toString()) + ", ") + (currentHolder)) + ", ") + (dueDate);
    
}