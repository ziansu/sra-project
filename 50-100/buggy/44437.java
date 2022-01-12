@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    if ((allRoutes.size()) > 0) {
        com.jjoe64.graphview.GraphView graph = ((com.jjoe64.graphview.GraphView) (view.findViewById(R.id.view_route_stats)));
        drawRouteGraph(i, graph);
    }
}