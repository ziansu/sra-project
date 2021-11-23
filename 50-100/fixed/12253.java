@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    final java.util.List<com.example.finalproject.Model.Dessert> dessertList = new java.util.LinkedList<com.example.finalproject.Model.Dessert>();
    for (com.google.firebase.database.DataSnapshot dstSnapshot : dataSnapshot.getChildren()) {
        com.example.finalproject.Model.Dessert dessert = dstSnapshot.getValue(com.example.finalproject.Model.Dessert.class);
        if ((maxKey[0]) < (dessert.getId())) {
            maxKey[0] = dessert.getId();
        }
        dessertList.add(dessert);
    }
    listener.onComplete(dessertList, maxKey[0]);
}