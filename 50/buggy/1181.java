@java.lang.Override
public void onClick(android.view.View view) {
    registerForContextMenu(view);
    getActivity().openContextMenu(view);
}