public void setColumnWidth(int width) {
    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(tesla.andrew.magicchart.custom_views.Column.dpToPx(context, width), tesla.andrew.magicchart.custom_views.Column.dpToPx(context, 120), 0);
    column.setLayoutParams(layoutParams);
}