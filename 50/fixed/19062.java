@java.lang.Override
public void onBindViewHolder(ru.mail.park.chat.activities.adapters.MessagesAdapter.ViewHolder holder, int position) {
    ru.mail.park.chat.models.Message message = messagesSet.get(position);
    holder.setMessage(message, position);
}