public boolean isEmpty() {
    for (int i = 0; i < (playerAnswer.size()); i++) {
        if (playerAnswer[i].equals("_")) {
            return true;
        }
    }
    return false;
}