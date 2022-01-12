@java.lang.Override
public void onBindViewHolder(final org.cnx.android.adapters.LandingListRecyclerViewAdapter.ViewHolder holder, int position) {
    org.cnx.android.beans.Content book = contentList.get(position);
    holder.bookTitle.setText(book.getBookTitle());
    if (((holder.logo) != null) && ((book.getIcon()) != null)) {
        holder.logo.setImageResource(org.cnx.android.utils.CNXUtil.getCoverId(book, context));
    }
}