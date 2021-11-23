@java.lang.Override
public app.easy.text.texteasy.Messages.MessageAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v;
    if (viewType == 1) {
        v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.chatmessagethem, parent, false);
    }else {
        v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.chatmessageyou, parent, false);
    }
    app.easy.text.texteasy.Messages.MessageAdapter.ViewHolder vh = new app.easy.text.texteasy.Messages.MessageAdapter.ViewHolder(v);
    return vh;
}