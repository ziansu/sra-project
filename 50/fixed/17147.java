public void updateListView() {
    mBusEvalExpandableAdapter = new br.edu.ufcg.analytics.meliorbusao.adapters.RouteEvaluationExpandableAdapter(getActivity(), generateRouteSummaries(), mRecyclerView, mCallback);
    mRecyclerView.setAdapter(mBusEvalExpandableAdapter);
}