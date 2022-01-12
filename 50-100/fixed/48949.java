@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    createItemList.clear();
    if ((getContext()) != null) {
        for (com.google.firebase.database.DataSnapshot tempSnapshot : dataSnapshot.getChildren()) {
            pearsistent.knutreasurehunt.Item item = tempSnapshot.getValue(pearsistent.knutreasurehunt.Item.class);
            item.setCheckBox(new android.widget.CheckBox(this.getContext()));
            createItemList.add(item);
        }
        choicedList = createItemList;
        makeListView(listView, createItemList);
    }
}