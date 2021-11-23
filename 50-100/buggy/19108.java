private void setView() {
    com.nr.viewnote.db.NoteEntity entity = com.nr.viewnote.db.DbAdapter.getInstance(getActivity()).getEntityToView(id);
    imageView.setImageBitmap(com.nr.androidutils.BitmapUtils.convertCompressedByteArrayToBitmap(entity.getImage()));
    editText.setText(entity.getText());
    editText.setEnabled(true);
}