private void setup(model.daoModels.BibleChapter currentChapter, model.daoModels.BibleChapter secondaryChapter) {
    mainVersionText = (currentChapter != null) ? currentChapter.getBook().getVersion().getTitle() : "";
    secondaryVersionText = (secondaryChapter != null) ? secondaryChapter.getBook().getVersion().getTitle() : "";
    titleText = (currentChapter != null) ? currentChapter.getTitle() : "";
}