@java.lang.Override
public void onBindViewHolder(final com.androiddev.sharvani.wikiimagesearch.view.recyclerview.viewholder.WikiSearchViewHolder holder, int position) {
    final com.androiddev.sharvani.wikiimagesearch.models.PageDetail pageDetail = pageDetails.get(position);
    final java.lang.String title = ((pageDetail.getTitle()) == null) ? "" : pageDetail.getTitle();
    if ((pageDetail.getThumbnail()) != null) {
        holder.bind(pageDetail.getThumbnail().getSourceUrl(), title);
    }
}