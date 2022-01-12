@java.lang.Override
public void onBindViewHolder(edu.uw.tcss450.group8.frolicker.PrefsInitAdapter.Holder holder, int position) {
    if (position < (mKeyList.size())) {
        holder.mName.setText(mKeyList.get(position));
    }
}