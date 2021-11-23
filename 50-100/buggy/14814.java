private boolean isFloatingTask(java.util.ArrayList<java.lang.String> list) {
    if (((list.get(START_TIME).length()) == 0) && ((list.get(END_TIME).length()) == 0)) {
        java.lang.System.out.println("is floating");
        return true;
    }else {
        return false;
    }
}