@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, final android.view.View view, int position, long id) {
    java.util.HashMap<java.lang.String, java.lang.String> hash = list.get(position);
    hash.size();
    int routeId = java.lang.Integer.parseInt(hash.get("1"));
    viewRouteDetails(routeId);
}