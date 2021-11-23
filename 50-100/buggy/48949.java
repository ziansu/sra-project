@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    createItemList.clear();
    for (com.google.firebase.database.DataSnapshot tempSnapshot : dataSnapshot.getChildren()) {
        pearsistent.knutreasurehunt.Item item = tempSnapshot.getValue(pearsistent.knutreasurehunt.Item.class);
        item.setCheckBox(new android.widget.CheckBox(getContext()));
        createItemList.add(item);
    }
    choicedList = createItemList;
    makeListView(listView, createItemList);
}