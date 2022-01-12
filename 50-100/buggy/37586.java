@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.ImageView previewImageView = ((android.widget.ImageView) (v));
    go4.szut.de.nametrainer.database.Member member = ((go4.szut.de.nametrainer.database.Member) (previewImageView.getTag()));
    android.content.Intent galleryChooserIntent = new android.content.Intent();
    activity.getIntent().putExtra("member", member);
    galleryChooserIntent.setType("image/*");
    galleryChooserIntent.setAction(Intent.ACTION_OPEN_DOCUMENT);
    activity.startActivityForResult(android.content.Intent.createChooser(galleryChooserIntent, activity.getResources().getString(R.string.groupeditor_gallerychooser_title)), go4.szut.de.nametrainer.groupeditor.GroupEditorActivity.SELECT_PICTURE_ADD);
}