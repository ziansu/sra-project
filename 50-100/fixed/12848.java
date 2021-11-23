@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View view = super.getView(position, convertView, parent);
    android.widget.TextView text1 = ((android.widget.TextView) (view.findViewById(android.R.id.text1)));
    android.widget.TextView text2 = ((android.widget.TextView) (view.findViewById(android.R.id.text2)));
    text1.setText(recipes.get(position).getName());
    text2.setText(recipes.get(position).getComments());
    return view;
}