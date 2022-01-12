void bind(com.blumental.lifesliceapp.model.Record record, android.support.v4.util.LruCache<java.lang.String, android.graphics.Bitmap> avatarCache) {
    itemView.setTag(record.getVideoUrl());
    setAvatar(record, avatarCache);
    username.setText(record.getUsername());
}