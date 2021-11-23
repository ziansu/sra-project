@java.lang.Override
public void onListReceived(com.example.admin.myapplication.model.entities.GroceryList list) {
    if ((adapter) != null) {
        adapter.removeList(list);
    }
}