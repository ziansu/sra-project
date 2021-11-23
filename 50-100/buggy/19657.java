public static void myToast(java.lang.String msg, int length_of_time) {
    if (length_of_time == 2) {
        android.widget.Toast.makeText(developingalex.noteal.NoteManager.MainActivityContext, msg, Toast.LENGTH_LONG).show();
    }
    if (length_of_time == 1) {
        android.widget.Toast.makeText(developingalex.noteal.NoteManager.MainActivityContext, msg, Toast.LENGTH_SHORT).show();
    }
}