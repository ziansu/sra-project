public static Word find(int id) {
    try {
        java.lang.System.out.println(Word.dictionary.get((id - 1)));
        return Word.dictionary.get((id - 1));
    } catch (java.lang.IndexOutOfBoundsException e) {
        return null;
    }
}