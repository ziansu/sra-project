@android.support.annotation.Nullable
public model.daoModels.BibleChapter getFirstBibleChapter() {
    java.util.List<model.daoModels.Book> books = getBooks();
    if ((books != null) && (!(books.isEmpty()))) {
        java.util.List<model.daoModels.BibleChapter> chapters = books.get(0).getBibleChapters();
        if ((chapters != null) && (!(chapters.isEmpty()))) {
            return chapters.get(0);
        }
    }
    return null;
}