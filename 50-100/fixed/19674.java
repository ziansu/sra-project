@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot shot : dataSnapshot.getChildren()) {
        com.qg_tech.android.testproject.models.ShopModel model = shot.getValue(com.qg_tech.android.testproject.models.ShopModel.class);
        list.add(model.getShopName());
        uids.add(shot.getKey());
    }
    mAdapter.notifyDataSetChanged();
}