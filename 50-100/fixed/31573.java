public void deleteUser(int which) {
    android.util.Log.d("Deleting user", filteredTokens.get(which));
    com.google.firebase.database.FirebaseDatabase.getInstance().getReference(("patients/" + (filteredTokens.get(which)))).child("state").setValue(state.DELETED);
    filteredTokens.remove(which);
}