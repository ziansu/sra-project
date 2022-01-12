@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    baseParseAdapter2 = com.rorlig.babyapp.ui.adapter.parse.ArrayAdapterFactory.getAdapter(parseClassName, parseObjectList);
    if ((ultimateRecyclerView) != null) {
        ultimateRecyclerView.setAdapter(baseParseAdapter2);
        ultimateRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    }
}