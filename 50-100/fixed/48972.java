@java.lang.Override
public void onBindViewHolder(com.example.app.ourapplication.RVAdapter.PersonViewHolder personViewHolder, int i) {
    personViewHolder.senderName.setText(mFeeds.get(i).name);
    personViewHolder.senderMessage.setText(mFeeds.get(i).age);
    personViewHolder.senderPhoto.setImageResource(mFeeds.get(i).photoId);
    personViewHolder.messagePhoto.setImageResource(mFeeds.get(i).photoId);
    android.util.Log.d(TAG, ("onBindViewHolder :" + i));
}