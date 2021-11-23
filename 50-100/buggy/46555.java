public void onCreate(android.os.Bundle savedInstanceState) {
    info.love4codebits.app.ImageSent.prefs = new info.love4codebits.app.ObscuredSharedPreferences(this, this.getSharedPreferences(info.love4codebits.app.ImageSent.MY_PREFS_FILE_NAME, Context.MODE_PRIVATE));
    btn1 = ((android.widget.Button) (findViewById(R.id.button1)));
    btn1.setOnClickListener(this);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.imgsent);
    info.love4codebits.app.ImageSent.prefs.edit().putInt("date", c.get(java.util.Calendar.DAY_OF_MONTH)).commit();
}