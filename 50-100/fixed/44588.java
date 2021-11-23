@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(context, in.reweyou.reweyouforums.CommentActivity.class);
    i.putExtra("from", "nb");
    i.putExtra("threadid", messagelist.get(getAdapterPosition()).getId());
    context.startActivity(i);
    notifyItemChanged(getAdapterPosition(), "change");
    sendrequestforseenchange(getAdapterPosition());
}