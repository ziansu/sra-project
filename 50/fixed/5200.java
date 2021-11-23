protected void onBindView(android.view.View view) {
    mView = view;
    widgetFrameView = ((android.widget.LinearLayout) (view.findViewById(android.R.id.widget_frame)));
    setPreviewColor();
}