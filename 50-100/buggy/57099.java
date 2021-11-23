@java.lang.Override
public void onEdgeDetailsClicked() {
    de.htwberlin.f4.ai.ma.persistence.DatabaseHandler databaseHandler = de.htwberlin.f4.ai.ma.persistence.DatabaseHandlerFactory.getInstance(view.getContext());
    de.htwberlin.f4.ai.ma.edge.Edge edge = de.htwberlin.f4.ai.ma.edge.EdgeFactory.createInstance(startNode, targetNode, false, 0);
    if (databaseHandler.checkIfEdgeExists(edge)) {
        de.htwberlin.f4.ai.ma.android.BaseActivity activity = ((de.htwberlin.f4.ai.ma.android.BaseActivity) (view));
        activity.loadEdgeDetails(startNode.getId(), targetNode.getId());
    }
}