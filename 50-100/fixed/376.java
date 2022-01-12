@java.lang.Override
public void bindView(android.view.View convertView, android.content.Context context, android.database.Cursor cursor) {
    android.widget.ImageView view = ((android.widget.ImageView) (convertView.findViewById(R.id.list_item_poster_image)));
    com.squareup.picasso.Picasso.with(context).load(getURL(cursor)).fit().into(view);
}