private void removeGroupLists(java.lang.String groupKey, com.example.admin.myapplication.controller.ObjectReceivedHandler listRemovedHandler) {
    java.util.List<com.example.admin.myapplication.model.entities.GroceryList> listsToRemove = new java.util.ArrayList<>();
    synchronized(lists) {
        for (com.example.admin.myapplication.model.entities.GroceryList list : lists) {
            if (list.getGroupKey().equals(groupKey)) {
                listsToRemove.add(list);
            }
        }
        for (com.example.admin.myapplication.model.entities.GroceryList list : listsToRemove) {
            lists.removeAll(listsToRemove);
            listRemovedHandler.onObjectReceived(list);
        }
    }
}