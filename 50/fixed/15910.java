public POJOs.Card removeBottom() {
    (this.size)--;
    if ((size) > (-1)) {
        return cards.remove(0);
    }else {
        return null;
    }
}