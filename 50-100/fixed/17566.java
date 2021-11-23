private void unbindFileView(org.amahi.anywhere.server.model.ServerFile file, android.view.View fileView) {
    android.widget.TextView fileTitle = ((android.widget.TextView) (fileView.getTag(org.amahi.anywhere.adapter.ServerFilesMetadataAdapter.Tags.FILE_TITLE)));
    android.widget.ImageView fileIcon = ((android.widget.ImageView) (fileView.getTag(org.amahi.anywhere.adapter.ServerFilesMetadataAdapter.Tags.FILE_ICON)));
    fileTitle.setText(null);
    fileTitle.setBackgroundResource(android.R.color.transparent);
    fileIcon.setImageResource(getFileIcon(file));
    fileIcon.setBackgroundResource(R.color.background_secondary);
}