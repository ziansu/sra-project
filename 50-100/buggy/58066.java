@java.lang.Override
public android.view.View getView(int position, android.view.View view, android.view.ViewGroup parent) {
    android.view.LayoutInflater inflater = context.getLayoutInflater();
    android.view.View rowView = inflater.inflate(R.layout.list_single, null, true);
    android.widget.ImageView imageView = ((android.widget.ImageView) (rowView.findViewById(R.id.navigation_icon)));
    imageView.setImageResource(suit.halo.suitcontroller.Constants.getIconResource(("" + (listOfChoices[position]))));
    return rowView;
}