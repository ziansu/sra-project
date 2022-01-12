@java.lang.SuppressWarnings(value = "resource")
public static void main(java.lang.String[] args) throws java.io.IOException {
    Homework.indexing index = new Homework.indexing();
    java.util.HashSet<Homework.indexing.Pair> words = new java.util.HashSet<Homework.indexing.Pair>();
    Homework.indexing.Pair pair = index.new Pair();
    java.io.File[] currentfolder = new java.io.File("C:/Temp/en/articles/5/").listFiles();
    index.StopWords(Homework.indexing.list(new java.io.File("C:/Temp/en/")));
    index.extracter(Homework.indexing.list(new java.io.File("C:/Temp/en/")));
}