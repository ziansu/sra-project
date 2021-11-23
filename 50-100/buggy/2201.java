@java.lang.Override
public void onPostExecute(java.lang.Integer result) {
    if (result == 2) {
        android.widget.Toast.makeText(this, "Your login session has expired.", Toast.LENGTH_SHORT);
        return ;
    }
    if (result != 0) {
        synchronized(timerTrigger) {
            if (timerTrigger) {
                findViewById(R.id.CoverImage).setVisibility(View.GONE);
            }else {
                timerTrigger = true;
            }
        }
    }else {
        synchronized(timerTrigger) {
            if (timerTrigger) {
                Proceed();
            }else {
                timerTrigger = true;
            }
        }
    }
}