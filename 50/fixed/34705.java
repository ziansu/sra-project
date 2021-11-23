@java.lang.Override
public void onStudentDetailInteraction() {
    android.util.Log.d("digvijay", "Data sucessfully submitted");
    android.content.Intent intent = com.example.shivanshu.alumniconnect.ProfileActivity.getProfileActivityIntent(this);
    startActivity(intent);
}