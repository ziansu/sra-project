@java.lang.Override
public void onSuccess() {
    android.util.Log.d("LoginActivity", "Clear Calendar from database success");
    saveCalendarToDatabase();
}