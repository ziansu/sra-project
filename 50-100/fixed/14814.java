private boolean isFloatingTask(java.util.ArrayList<java.lang.String> list) {
    if (((list.get(START_TIME).length()) == 0) && ((list.get(END_TIME).length()) == 0)) {
        return true;
    }else {
        return false;
    }
}