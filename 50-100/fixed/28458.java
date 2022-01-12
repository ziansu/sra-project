@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    app = ((gruppe3.dtu02128.fridgeapp.FridgeApp) (getActivity().getApplication()));
    dbhelp = app.getDBHelper();
    adapter = app.getContainerAdapter();
    adapter = new gruppe3.dtu02128.fridgeapp.ContainerCursorAdapter(getActivity(), dbhelp.getContainerListFromDB(), dbhelp);
    setListAdapter(adapter);
    return super.onCreateView(inflater, container, savedInstanceState);
}