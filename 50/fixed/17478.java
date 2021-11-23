@java.lang.Override
public void onBindViewHolder(com.localytics.android.itracker.ui.MediaDownloadFragment.MediaDownloadAdapter.ViewHolder holder, int position) {
    holder.bindData(mDownloads.get((((mDownloads.size()) - 1) - position)));
}