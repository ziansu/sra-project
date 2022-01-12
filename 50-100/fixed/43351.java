@java.lang.Override
public com.mcssoft.racemeetings2.adapter.MeetingsViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (parent instanceof android.support.v7.widget.RecyclerView) {
        view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.meeting_row, parent, false);
        return new com.mcssoft.racemeetings2.adapter.MeetingsViewHolder(view, itemClickListener);
    }else {
        throw new java.lang.RuntimeException("Not bound to RecyclerView");
    }
}