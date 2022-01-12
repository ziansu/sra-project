public void stop_progress_dialog() {
    if ((m_prog_dialog) != null) {
        m_prog_dialog.dismiss();
        m_prog_dialog = null;
    }else {
        android.util.Log.e(com.sleepfuriously.hpgworkout.BaseDialogActivity.tag, "Tried to stop a progress dialog that was already null!  Here's the stack tracke");
        java.lang.Throwable e = new java.lang.Throwable();
        e.printStackTrace();
    }
}