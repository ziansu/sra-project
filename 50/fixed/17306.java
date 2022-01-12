public void putOrderList(in.curience.hacktrec.Models.OrderedData data) {
    java.util.ArrayList<in.curience.hacktrec.Models.OrderedData> list = getOrdersList();
    list.add(data);
    java.lang.String updated = gson.toJson(list);
    editor.putString(ORDERS_LIST, updated).commit();
}