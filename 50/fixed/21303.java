@java.lang.Override
public void onInput(java.lang.String input) {
    categoryData.addName(input);
    setContentView(createView());
}