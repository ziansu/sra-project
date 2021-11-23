public void makeSelectedRead() {
    monakhv.samlib.db.entity.Author author = getSelected();
    if (author == null) {
        return ;
    }
    if (author.isIsNew()) {
        monakhv.android.samlib.animation.Flip3D ff = flips.get(getSelectedPosition());
        if (ff != null) {
            ff.makeFlip();
        }else {
            monakhv.android.samlib.service.AuthorEditorServiceIntent.markAuthorRead(context, author.getId());
            cleanSelection();
        }
    }
}