@java.lang.Override
public com.xkc.chatrobot.adapter.ChatTextAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    com.xkc.chatrobot.adapter.ChatTextAdapter.ViewHolder holder = null;
    android.view.View itemView = null;
    switch (viewType) {
        case com.xkc.chatrobot.model.ChatText.USER :
            itemView = mInflater.inflate(R.layout.right_layout, parent);
            holder = new com.xkc.chatrobot.adapter.ChatTextAdapter.RightViewHolder(itemView);
            break;
        case com.xkc.chatrobot.model.ChatText.ROBOT :
            itemView = mInflater.inflate(R.layout.left_layout, parent);
            holder = new com.xkc.chatrobot.adapter.ChatTextAdapter.LeftViewHolder(itemView);
            break;
    }
    return holder;
}