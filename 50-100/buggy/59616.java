private android.widget.LinearLayout createSection(java.lang.Integer turnNumber) {
    android.view.LayoutInflater layoutInflater = android.view.LayoutInflater.from(view.getContext());
    android.widget.LinearLayout section = ((android.widget.LinearLayout) (layoutInflater.inflate(R.layout.section, layoutHolder, false)));
    android.widget.TextView sectionText = butterknife.ButterKnife.findById(section, R.id.text);
    java.lang.String text = ((view.getResources().getString(R.string.logTurn)) + " ") + (turnNumber.toString());
    sectionText.setText(text);
    return section;
}