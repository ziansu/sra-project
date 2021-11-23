@java.lang.Override
public android.view.View getView(int count, android.view.View oldView, android.view.ViewGroup parent) {
    android.view.View row = ((android.view.LayoutInflater) (mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE))).inflate(R.layout.search_food_single_row, parent, false);
    ((android.widget.TextView) (row.findViewById(R.id.search_food_title))).setText(MainActivity.foodList.get(count));
    return row;
}