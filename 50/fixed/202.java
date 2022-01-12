public void assertItemsLeft(int count) {
    assertThat(listElementWithText(byCSS("#todo-count>strong"), java.lang.Integer.toString(count)));
}