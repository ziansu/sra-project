@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.row_others_text_message, parent, false);
    switch (viewType) {
        case R.layout.row_my_text_message :
            return new com.pubnubchat.adapter.ChatAdapter.MyTextHolder(view);
        default :
            return new com.pubnubchat.adapter.ChatAdapter.OthersTextHolder(view);
    }
}