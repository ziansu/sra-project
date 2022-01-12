@java.lang.Override
public android.view.View getView(final int position, android.view.View convertView, android.view.ViewGroup parent) {
    convertView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
    android.widget.TextView textViewCard = ((android.widget.TextView) (convertView.findViewById(R.id.textViewCard)));
    textViewCard.setText(mData.get(position));
    return convertView;
}