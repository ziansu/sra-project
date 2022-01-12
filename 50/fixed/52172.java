@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    mCardAdapter.clearLessons();
    for (com.google.firebase.database.DataSnapshot lessonUserSnap : dataSnapshot.getChildren()) {
        getLessonAndAddToList(lessonUserSnap);
    }
}