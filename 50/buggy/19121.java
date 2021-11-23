@java.lang.Override
public void onPause() {
    super.onPause();
    mSwipeRefreshLayout.setOnRefreshListener(null);
    mainsearchtitle.addTextChangedListener(null);
    mainsearchbtn.setOnClickListener(null);
}