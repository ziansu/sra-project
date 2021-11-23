@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    setContentView(R.layout.item);
    com.sargent.mark.todolist.AddToDoFragment frag = new com.sargent.mark.todolist.AddToDoFragment();
    frag.show(fm, "addtodofragment");
}