@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.M)
public android.view.View getDropDownView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View v = super.getDropDownView(position, convertView, parent);
    android.graphics.Typeface externalFont = android.graphics.Typeface.createFromAsset(getAssets(), "RobotoCondensed-BoldItalic.ttf");
    ((android.widget.TextView) (v)).setTypeface(externalFont);
    v.setBackgroundColor(getResources().getColor(R.color.Yellow, null));
    return v;
}