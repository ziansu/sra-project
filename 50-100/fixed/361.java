@org.junit.Test
public void test() {
    CS3213.RequireWords requireWords = new CS3213.RequireWords();
    java.lang.String[] lines = new java.lang.String[]{ "test a line" , "a simple line" , "this is test" , "easy task" };
    java.lang.String[] test = new java.lang.String[]{ "this" };
    for (java.lang.String str : test) {
        requireWords.addWordToList(str);
    }
    java.util.ArrayList<java.lang.String> output = requireWords.CheckRequireWords(lines);
    assertEquals(1, requireWords.getSize());
}