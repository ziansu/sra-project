public boolean checkNull() {
    boolean isEmpty = false;
    for (int i = 0; i < (count); i++) {
        for (int j = 0; j <= (count); j++) {
            if (adapter.getItemByXY(i, j).getText().toString().equals("")) {
                isEmpty = true;
            }
        }
    }
    return isEmpty;
}