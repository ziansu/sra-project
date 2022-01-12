public java.util.List<chipmunk.segmenter.Word> map(java.util.List<chipmunk.segmenter.Word> words) {
    getData();
    java.util.List<chipmunk.segmenter.Word> new_words = new java.util.LinkedList<>();
    for (chipmunk.segmenter.Word word : words) {
        chipmunk.segmenter.Word new_word = vocab_.get(word.getWord());
        assert new_word != null;
        new_words.add(new_word);
    }
    return new_words;
}