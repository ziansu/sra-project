@java.lang.Override
public void onBindViewHolder(com.tolichp.spirifoxy.altstu_personal_office.adapter.SessionsRecyclerAdapter.ViewHolder holder, int position) {
    com.tolichp.spirifoxy.altstu_personal_office.data.Subject subject = subjectsList.get(position);
    holder.mTextViewSubjectName.setText(subject.getName());
    if ((holder.mItemView) != null) {
        holder.mItemView.setLayoutParams(new android.view.ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        holder.mItemView.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                android.util.Log.d(com.tolichp.spirifoxy.altstu_personal_office.adapter.SessionsRecyclerAdapter.TAG, "rl click");
            }
        });
    }
}