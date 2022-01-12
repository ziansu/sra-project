private void update_time() {
    if ((internal_state) == (org.timematters.misc.States.STATE_RUNNING)) {
        long curr = java.lang.System.currentTimeMillis();
        total_time += curr - (elapsed_time);
        android.widget.TextView txt = ((android.widget.TextView) (findViewById(R.id.txt_time)));
        txt.setText(org.timematters.misc.DateHandler.GetElapsedTime(total_time));
        elapsed_time = java.lang.System.currentTimeMillis();
    }
}