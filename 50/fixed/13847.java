public void loadSetup(int position) {
    com.androidandyuk.kitchentimer.MainActivity.itemList.clear();
    com.androidandyuk.kitchentimer.timerSetup thisSetup = com.androidandyuk.kitchentimer.MainActivity.savedSetups.get(position);
    for (com.androidandyuk.kitchentimer.timerItem thisItem : thisSetup.itemsSetup) {
        com.androidandyuk.kitchentimer.MainActivity.itemList.add(thisItem);
    }
}