@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.util.List<org.mixare.sectionedlist.Item> list;
    list = createList();
    sectionedListAdapter = new org.mixare.SectionedListAdapter(this.getActivity(), this.getActivity(), 0, list);
}