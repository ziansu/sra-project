@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    com.activiti.OrderConnect ordercnt = new com.activiti.OrderConnect(user);
    ordercnt.claimtask(order.id, 0);
    ordercnt.update(order.processid, 3, "Ondoor", "*", "Isaccepted", "0", "Timestamp", ("" + (java.lang.System.currentTimeMillis())));
    return null;
}