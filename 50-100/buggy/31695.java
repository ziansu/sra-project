@android.support.annotation.NonNull
@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    com.yesat.takebs.support.Chat chat = getItem(position);
    boolean right = chat.fromId.equals(mAuth.getCurrentUser().getUid());
    if (convertView == null) {
        convertView = android.view.LayoutInflater.from(getContext()).inflate((right ? R.layout.item_chat_right : R.layout.item_chat_left), parent, false);
    }
    ((android.widget.TextView) (convertView.findViewById(R.id.chat_text))).setText(chat.text);
    return convertView;
}