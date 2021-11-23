@java.lang.Override
public void onResume() {
    super.onResume();
    getActivity().setTitle(this.notebookName);
    refreshNotes();
}