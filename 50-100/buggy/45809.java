private void getBundle() {
    android.os.Bundle bundle = getIntent().getExtras();
    mComparator = bundle.getInt(Const.COMPARATOR_FACTORY);
    java.lang.String category = bundle.getString(Const.CATEGORY_LABEL);
    mPosition = bundle.getInt(Const.PHOTO_POSITION);
    mPhotoNote = com.yydcdut.note.model.PhotoNoteDBModel.getInstance().findByCategoryLabel(category, mComparator).get(mPosition);
}