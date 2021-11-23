private com.askonthego.ui.ISurveyComponent buildSpacerComponent(com.askonthego.parser.SpacerModel model) {
    com.askonthego.ui.SpacerComponent spacerComponent = ((com.askonthego.ui.SpacerComponent) (layoutInflater.inflate(R.layout.spacer, null)));
    int height = ((int) (android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, model.getHeight(), this.activity.getResources().getDisplayMetrics())));
    android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, height);
    spacerComponent.setLayoutParams(params);
    return spacerComponent;
}