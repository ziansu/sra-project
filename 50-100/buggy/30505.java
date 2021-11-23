public static java.lang.String randWordFromLevel(WordFile file, int level) {
    java.util.ArrayList<java.lang.String> levelWords = FileModel.getLevelWords(file, level);
    if ((levelWords.size()) > 0) {
        int index = (new java.util.Random().nextInt(levelWords.size())) + 1;
        return levelWords.get(index);
    }else {
        return "";
    }
}