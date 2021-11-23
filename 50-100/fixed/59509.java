@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String listName = getListName();
    if (groceryManager.createNewList(listName)) {
        ((com.example.myfirstapp.ui.NavigationActivity) (getActivity())).replaceThis(com.example.myfirstapp.ui.SelectCategoryFragment.newInstance(0), "Cart");
        ((com.example.myfirstapp.ui.NavigationActivity) (getActivity())).closeDialogs();
    }else {
        ((com.example.myfirstapp.ui.NavigationActivity) (getActivity())).showDialog(com.example.myfirstapp.ui.CreateListDialog2.newInstance());
    }
}