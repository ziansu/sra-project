@java.lang.Override
public android.view.View getView(int position, android.view.View view, android.view.ViewGroup parent) {
    android.view.LayoutInflater inflater = context.getLayoutInflater();
    android.view.View rowView = inflater.inflate(R.layout.list_single, null, true);
    android.widget.TextView txtTitle = ((android.widget.TextView) (rowView.findViewById(R.id.txt)));
    android.widget.ImageView imageView = ((android.widget.ImageView) (rowView.findViewById(R.id.img)));
    txtTitle.setText(web[position]);
    imageView.setImageResource(imageId[position]);
    return rowView;
}