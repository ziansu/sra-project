@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    for (int i = 0; i < (parent.getCount()); i++) {
        resetItemEffect(parent.getChildAt(i));
        java.lang.System.out.println(i);
    }
    renderItemSelectedEffect(view);
    mAnswer = ((java.lang.String) (parent.getItemAtPosition(position)));
    showChooseModeBtn();
}