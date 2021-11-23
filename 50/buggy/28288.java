@java.lang.Override
public com.wenjiehe.xingji.Adapter.ChatRecyclerViewAdapter.ChatViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v = android.view.LayoutInflater.from(context).inflate(R.layout.recyclerview_chat_list, parent, false);
    com.wenjiehe.xingji.Adapter.ChatRecyclerViewAdapter.ChatViewHolder nvh = new com.wenjiehe.xingji.Adapter.ChatRecyclerViewAdapter.ChatViewHolder(v, com.baidu.location.h.a.i);
    return nvh;
}