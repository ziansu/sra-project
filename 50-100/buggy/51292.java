@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.example.radhika.finalproject.PlaceDetail value = dataSnapshot.getValue(com.example.radhika.finalproject.PlaceDetail.class);
    if (value != null) {
        try {
            android.util.Log.d("DREW", "attempting to update comments...");
            temp_count = java.lang.Integer.parseInt(value.count);
            temp_rating = java.lang.Float.parseFloat(value.rating);
            if ((value.comment) != null) {
                comment = value.comment;
            }
        } catch (java.lang.Exception e) {
        }
    }
}