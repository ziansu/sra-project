@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    toolbar.setTitle(R.string.app_name);
    android.widget.TextView demoText = ((android.widget.TextView) (findViewById(R.id.test_text)));
    com.klinker.android.link_builder.LinkBuilder.on(demoText).addLinks(getExampleLinks()).build();
}