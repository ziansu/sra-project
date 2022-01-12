public void updateChoicesForTag(support.Utilities.Tag tag, models.DataCompilationModel.DataCompilationModelCallback cb) {
    if ((tag.equals(Tag.AlbumArt)) || (tag.equals(Tag.AlbumArtMeta))) {
        cb.done(0);
    }else {
        java.lang.String originalText = ((java.lang.String) (audioFilesModel.getDataForTag(tag)));
        int size = addPossibleDataForTag(tag, originalText);
        cb.done(size);
    }
}