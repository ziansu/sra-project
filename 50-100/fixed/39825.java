public java.lang.String popback() {
    if ((items.size()) > 1) {
        items.remove(((items.size()) - 1));
        return items.get(((items.size()) - 1));
    }else {
        return "";
    }
}