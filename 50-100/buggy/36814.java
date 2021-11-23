@java.lang.Override
public void onBindViewHolder(final com.neelakshbhatia.roome.MessageAdapter.MyViewHolder holder, int position) {
    com.neelakshbhatia.roome.Card card = messageList.get(position);
    android.util.Log.d("bad", java.lang.String.valueOf(position));
    if ((!(card.getTitle().equals(""))) && (!(card.getMessage().equals("")))) {
        holder.title.setText(card.getTitle());
        holder.message.setText(card.getMessage());
        animate(holder);
    }
}