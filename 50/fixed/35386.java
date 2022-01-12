@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    android.util.Log.e(com.alpha2.duenem.view_pager_cards.TrainActivity.TAG, databaseError.getMessage());
}