public void onClick(android.view.View v) {
    mPatternView.setPattern(mGenerator.getPattern());
    mPatternView.invalidate();
    (counter)++;
}