public boolean checkNull() {
    boolean empty = true;
    for (int i = 0; i < (count); i++) {
        for (int j = 0; j <= (count); j++) {
            if (adapter.getItemByXY(i, j).toString().equals("")) {
                empty = false;
            }
        }
    }
    return empty;
}