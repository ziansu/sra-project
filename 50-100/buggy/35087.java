public void setupFirebase() {
    if (mbIsGrocery) {
        mListRef = new com.firebase.client.Firebase(edu.pacificu.cs493f15_1.utils.Constants.FIREBASE_URL_GROCERY_LISTS);
        mListItemsRef = new com.firebase.client.Firebase(edu.pacificu.cs493f15_1.utils.Constants.FIREBASE_URL_GROCERY_LIST_ITEMS).child(mListID);
    }else {
        mListRef = new com.firebase.client.Firebase(edu.pacificu.cs493f15_1.utils.Constants.FIREBASE_URL_KITCHEN_INVENTORY);
        mListItemsRef = new com.firebase.client.Firebase(edu.pacificu.cs493f15_1.utils.Constants.FIREBASE_URL_KITCHEN_INVENTORY_ITEMS).child(mListID);
    }
}