public void add(com.example.felipe.androidchat.entities.ChatMessage msg) {
    this.chatMessages.add(msg);
    this.notifyDataSetChanged();
}