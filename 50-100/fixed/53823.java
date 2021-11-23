@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    if (convertView == null) {
        convertView = new wuxian.me.filepicker.view.DocumentView(mContext);
    }
    wuxian.me.filepicker.view.DocumentView docView = ((wuxian.me.filepicker.view.DocumentView) (convertView));
    wuxian.me.filepicker.view.FileItem item = mFileItems.get(position);
    docView.setViewByItem(item);
    return convertView;
}