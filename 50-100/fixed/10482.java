public model.modelClasses.mainData.BibleChapterModel getBibleChapter(android.content.Context context, int chapterNumber) {
    this.getBibleChildModels(context);
    java.util.Collections.sort(this.bibleChapterModels);
    if (chapterNumber > (this.bibleChapterModels.size())) {
        return null;
    }else {
        for (model.modelClasses.mainData.BibleChapterModel chapter : bibleChapterModels) {
            if ((java.lang.Integer.parseInt(chapter.number.trim())) == chapterNumber) {
                return chapter;
            }
        }
    }
    return null;
}