public void remove(java.lang.Object object) {
    for (int i = 0; i < (size()); i++) {
        ReturnObject ro = list.get(i);
        java.lang.Object item = ro.getReturnValue();
        if (item.equals(object)) {
            list.remove(i);
            i--;
        }
    }
}