@org.junit.Test
public void test() {
    CS3213.RequireWords requireWords = new CS3213.RequireWords();
    java.lang.String[] lines = new java.lang.String[]{ "test a line" , "a simple line" , "this is test" , "easy task" };
    for (java.lang.String str : lines) {
        requireWords.addWordToList(str);
    }
    java.lang.String[] test = new java.lang.String[]{ "this" };
    java.util.ArrayList<java.lang.String> output = requireWords.CheckRequireWords(test);
    assertEquals(1, requireWords.getSize());
}