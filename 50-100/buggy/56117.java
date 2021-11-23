@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    data = new com.loopbook.cuhk_loopbook.BookFragment.Data();
    bookAdapter = new com.loopbook.cuhk_loopbook.BookFragment.BookAdapter(getActivity(), R.layout.list_item, data.getbooks());
    if ((getArguments()) != null ? getArguments().getBoolean("firstRun", false) : false) {
        getArguments().putBoolean("firstRun", false);
    }else {
        refresh();
    }
}