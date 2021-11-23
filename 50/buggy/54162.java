@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot categorySnapshot : dataSnapshot.getChildren()) {
        categoriesByUser.add(categorySnapshot.getValue(com.hallak.billdozer.models.Category.class));
    }
    android.util.Log.i(TAG, "Collected User Categories ");
}