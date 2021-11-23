@java.lang.Override
protected void onBindView(android.view.View view) {
    mView = view;
    super.onBindView(view);
    widgetFrameView = ((android.widget.LinearLayout) (view.findViewById(android.R.id.widget_frame)));
    setPreviewColor();
}