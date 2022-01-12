@grammar.Test
public void removeWord() throws java.lang.Exception {
    java.lang.System.out.println("***Test: removeWord***");
    gm.addWord("Noun", "test", "test");
    gm.removeWord("Noun", "test");
    boolean removed = true;
    for (java.lang.String s : gm.getAllWords("English", "Noun")) {
        if (s.equals("hello")) {
            removed = false;
            break;
        }
    }
    assertTrue(removed);
}