@java.lang.Override
public void fillValues(int position, android.view.View convertView) {
    profilePic = ((android.widget.ImageView) (convertView.findViewById(R.id.profilePic_messages_row)));
    name = ((android.widget.TextView) (convertView.findViewById(R.id.username_messages_row)));
    com.parse.ParseUser user = messageItems.get(position);
    name.setText(user.getString("name"));
    imageLoader.DisplayImage(user.getParseFile("profilePic").getUrl(), profilePic);
}