@java.lang.Override
public void onClick(android.view.View view) {
    java.util.ArrayList pArrayList = new java.util.ArrayList();
    matt.listmaker.ListObject test = new matt.listmaker.ListObject("List Name", 0, pArrayList);
    dbHelper.addListObject(test);
}