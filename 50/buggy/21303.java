@java.lang.Override
public void onInput(java.lang.String input) {
    categoryData.addName(input);
    final org.allison.choicemaker21.view.MultiSelectGroup categoryNamesGroup = new org.allison.choicemaker21.view.MultiSelectGroup(categoryData.getNames(), this);
    setContentView(categoryNamesGroup.createView());
}