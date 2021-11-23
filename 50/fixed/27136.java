@java.lang.Override
protected void onStop() {
    com.afollestad.assent.Assent.setActivity(this, null);
    super.onStop();
}