@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent galleryChooserIntent = new android.content.Intent();
    galleryChooserIntent.setType("image/*");
    galleryChooserIntent.setAction(Intent.ACTION_OPEN_DOCUMENT);
    activity.startActivityForResult(android.content.Intent.createChooser(galleryChooserIntent, activity.getResources().getString(R.string.groupeditor_gallerychooser_title)), go4.szut.de.nametrainer.groupeditor.GroupEditorActivity.SELECT_PICTURE_ADD);
}