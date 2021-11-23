@java.lang.Override
public void onBindViewHolder(org.cnx.android.adapters.FavsRecyclerViewAdapter.ViewHolder viewHolder, int i) {
    content = contentList.get(i);
    viewHolder.title.setText(content.getTitle());
    viewHolder.other.setText(content.getContentString());
    if ((viewHolder.logo) != null) {
        viewHolder.logo.setImageResource(org.cnx.android.utils.CNXUtil.getCoverId(content.getIcon(), context));
    }
}