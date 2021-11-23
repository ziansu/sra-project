@java.lang.Override
public void onClick(android.view.View v) {
    if (holder_temp.person_description_more.isChecked()) {
        holder_temp.person_description.setText(java.lang.String.format(mContext.getResources().getString(R.string.contacts_detail_more), description_more));
    }else {
        holder_temp.person_description.setText(java.lang.String.format(mContext.getResources().getString(R.string.contacts_detail), description));
    }
}