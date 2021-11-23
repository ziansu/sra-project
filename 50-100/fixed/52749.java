@java.lang.Override
public void onBindViewHolder(com.dnkilic.karabasan.DialogAdapter.ViewHolder holder, int position) {
    holder.tvQuestion.setText(dialogList.get(position).getQuestion());
    if (dialogList.get(position).isYesNoQuestion()) {
        holder.tvSign.setText(activity.getResources().getString(R.string.announce_yes_no));
    }
}