@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view;
    switch (viewType) {
        case R.layout.row_my_text_message :
            view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.row_my_text_message, parent, false);
            return new com.pubnubchat.adapter.ChatAdapter.MyTextHolder(view);
        default :
            view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.row_others_text_message, parent, false);
            return new com.pubnubchat.adapter.ChatAdapter.OthersTextHolder(view);
    }
}