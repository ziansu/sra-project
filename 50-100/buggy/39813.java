@org.junit.Test
public void testFormatItem() {
    bv.offa.netbeans.cmake.completion.CMakeCompletionItem funcItem = new bv.offa.netbeans.cmake.completion.CMakeCompletionItem("testName()", bv.offa.netbeans.cmake.completion.CMakeCompletionItem.ItemType.FUNCTION, 0, 1);
    assertEquals("testName()", funcItem.formatItem());
    bv.offa.netbeans.cmake.completion.CMakeCompletionItem varItem = new bv.offa.netbeans.cmake.completion.CMakeCompletionItem("testName", bv.offa.netbeans.cmake.completion.CMakeCompletionItem.ItemType.VARIABLE, 0, 1);
    assertEquals("testName", varItem.formatItem());
    bv.offa.netbeans.cmake.completion.CMakeCompletionItem otherItem = new bv.offa.netbeans.cmake.completion.CMakeCompletionItem("testName", bv.offa.netbeans.cmake.completion.CMakeCompletionItem.ItemType.OTHER, 0, 1);
    assertEquals("testName", otherItem.formatItem());
}