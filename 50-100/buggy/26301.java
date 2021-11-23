@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list);
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.list)));
    com.ckenergy.stackcard.stackcardlayoutmanager.StackCardLayoutManager stackCardLayoutManager = new com.ckenergy.stackcard.stackcardlayoutmanager.StackCardLayoutManager(com.ckenergy.stackcard.stackcardlayoutmanager.StackCardLayoutManager.VERTICAL, true, new com.ckenergy.stackcard.stackcardlayoutmanager.StackCardPostLayout());
    stackCardLayoutManager.setStackOrder(StackCardLayoutManager.OUT_STACK_ORDER);
    stackCardLayoutManager.setNumberOrder(StackCardLayoutManager.NEGATIVE_ORDER);
    com.ckenergy.stackcard.sample.RecyclerViewAdapter1 adapter = new com.ckenergy.stackcard.sample.RecyclerViewAdapter1(20);
    initRecyclerView(recyclerView, stackCardLayoutManager, adapter);
}