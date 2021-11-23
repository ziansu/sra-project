public void stop_progress_dialog() {
    android.util.Log.d(com.sleepfuriously.hpgworkout.BaseDialogActivity.tag, ("stop_progress_dialog(), id = " + (this.toString())));
    if ((m_prog_dialog) != null) {
        m_prog_dialog.dismiss();
        m_prog_dialog = null;
    }else {
        android.util.Log.e(com.sleepfuriously.hpgworkout.BaseDialogActivity.tag, "Tried to stop a progress dialog that was already null!  Here's the stack tracke");
        java.lang.Throwable e = new java.lang.Throwable();
        e.printStackTrace();
    }
}