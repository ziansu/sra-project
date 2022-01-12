public java.lang.String searchTag() {
    for (int i = 0; i < (this.size); i++) {
        java.lang.String tag = elementList[i].searchTag();
        if (tag != null) {
            return tag;
        }
    }
    return null;
}