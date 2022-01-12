@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ((android.widget.Button) (findViewById(R.id.button))).setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            new net.alhazmy13.hijridatepicker.HijriCalendarDialog.Builder(net.alhazmy13.hijricalenderexample.MainActivity.this).setOnDateSetListener(net.alhazmy13.hijricalenderexample.MainActivity.this).setMinMaxHijriYear(1430, 1450).setMinMaxGregorianYear(2013, 2020).setUILanguage(HijriCalendarDialog.Language.English).setMode(HijriCalendarDialog.Mode.Hijri).show();
        }
    });
}