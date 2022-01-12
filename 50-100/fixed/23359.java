public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View v = super.getView(position, convertView, parent);
    android.graphics.Typeface externalFont = android.graphics.Typeface.createFromAsset(getAssets(), "RobotoCondensed-BoldItalic.ttf");
    ((android.widget.TextView) (v)).setTypeface(externalFont);
    return v;
}