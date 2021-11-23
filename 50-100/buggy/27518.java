private logic.Word parseWord(java.lang.String input) {
    logic.Word word = new logic.Word();
    for (int i = 0; i < (input.length()); i++) {
        word.add(new logic.Char(input.charAt(i)));
    }
    return word;
}