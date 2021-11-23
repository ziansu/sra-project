public void updateChoicesForTag(support.Utilities.Tag tag, models.DataCompilationModel.DataCompilationModelCallback cb) {
    if ((tag.equals(Tag.AlbumArt)) || (tag.equals(Tag.AlbumArtMeta))) {
        cb.done(0);
    }else {
        java.lang.String originalText = ((java.lang.String) (audioFilesModel.getDataForTag(tag)));
        java.lang.System.out.println(("Originaltext: " + originalText));
        int size = addPossibleDataForTag(tag, originalText);
        java.lang.System.out.println(("updated size: " + size));
        cb.done(size);
    }
}