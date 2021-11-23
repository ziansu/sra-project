public boolean isDeadline() {
    if ("".equals(date.getValue())) {
        return false;
    }else {
        return true;
    }
}