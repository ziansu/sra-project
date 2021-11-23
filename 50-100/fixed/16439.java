public void removeOperation(java.lang.String id) {
    java.util.ArrayList arr = new java.util.ArrayList();
    arr.add(("DELETE from message_structure  where operation_id=" + id));
    arr.add(("DELETE from logic  where operation_id=" + id));
    arr.add(("DELETE from relationship  where operation_id=" + id));
    arr.add(("DELETE from operation  where id=" + id));
    cr.modifyDataTransactionMode(arr);
}