@java.lang.Override
public void onResume() {
    super.onResume();
    if ((getArguments()) != null) {
        java.lang.Long id = getArguments().getLong("memoryID");
        if (id != (-1)) {
            currentMemory = new br.nom.marcos.wolfgang.android.memoriesbox.MemoryDatabaseHandler(getActivity().getApplicationContext()).retrieveMemory(getArguments().getLong("memoryID"));
            loadMemoryData();
        }
    }
}