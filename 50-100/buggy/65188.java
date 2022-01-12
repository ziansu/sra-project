public void loadList(java.util.ArrayList<museum.findit.com.myapplication.model.ItemModel> itemcollection, java.lang.Integer seed) {
    completeCollection = itemcollection;
    if (seed != null)
        java.util.Collections.shuffle(completeCollection, new java.util.Random(seed));
    else
        java.util.Collections.shuffle(completeCollection, new java.util.Random(5));
    
    android.util.Log.d("DEBUG", ("game seed" + seed));
    itemCollection = new java.util.ArrayList<museum.findit.com.myapplication.model.ItemModel>(completeCollection.subList(0, 5));
    removeNullFromList();
    java.util.Collections.shuffle(itemcollection);
    playerProfile.clear();
}