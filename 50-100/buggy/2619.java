public void getBatchHashtags(java.util.ArrayList<java.lang.String> hashtagBatch, com.google.firebase.database.ValueEventListener listener) {
    for (int i = 0; i < (hashtagBatch.size()); i++) {
        android.util.Log.d("hashtag_batch", hashtagBatch.get(i));
        com.google.firebase.database.DatabaseReference dataRef = ref.child("Hashtags").child(hashtagBatch.get(i));
        dataRef.addListenerForSingleValueEvent(listener);
    }
}