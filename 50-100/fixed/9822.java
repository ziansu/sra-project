@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.out.println("Onclick choose call");
    android.content.Intent i = new android.content.Intent();
    i.putExtra(this.getString(R.string.intent_extra_directory), m_directory.getCurrentDirectory().getAbsolutePath());
    this.setResult(Activity.RESULT_OK, i);
    this.finish();
}