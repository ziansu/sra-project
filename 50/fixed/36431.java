public boolean isEvent() {
    if (("".equals(from.getValue())) || ("".equals(to.getValue()))) {
        return false;
    }else {
        return true;
    }
}