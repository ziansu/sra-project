public boolean removeTF(java.lang.String question) {
    int index = searchTF(question);
    if (index > (-1)) {
        questionsTF.remove(index);
        order.remove(index);
        (size)--;
        return true;
    }
    return false;
}