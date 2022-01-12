private void getBundle() {
    android.os.Bundle bundle = getIntent().getExtras();
    java.lang.String category = bundle.getString(Const.CATEGORY_LABEL);
    mPosition = bundle.getInt(Const.PHOTO_POSITION);
    mComparator = bundle.getInt(Const.COMPARATOR_FACTORY);
    mPhotoNote = com.yydcdut.note.model.PhotoNoteDBModel.getInstance().findByCategoryLabel(category, mComparator).get(mPosition);
}