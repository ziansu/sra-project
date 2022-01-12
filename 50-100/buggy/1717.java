@java.lang.Override
public android.view.View getView(int i, android.view.View convertView, android.view.ViewGroup viewGroup) {
    android.view.View row = convertView;
    if (row == null) {
        row = inflater.inflate(LayResId, viewGroup, false);
        com.lab3.domain.Photo currMeet = getPhoto(i);
        android.widget.ImageView meetName = ((android.widget.ImageView) (row.findViewById(R.id.bmp)));
        meetName.setImageBitmap(currMeet.getImage());
    }
    return row;
}