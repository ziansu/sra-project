@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.jenshensoft.widgetview.WidgetContainerLayout widgetContainer = ((com.jenshensoft.widgetview.WidgetContainerLayout) (findViewById(R.id.container)));
    android.view.View view = new android.widget.Button(this);
    view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    view.setBackgroundColor(android.support.v4.content.ContextCompat.getColor(this, R.color.colorAccent));
}