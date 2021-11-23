@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_home, container, false);
    mUnBinder = butterknife.ButterKnife.bind(this, view);
    setupToolbar();
    mColListAdapter = new com.tomeokin.lspush.biz.home.CollectionListAdapter(mColList, this);
    mColRv.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    mColRv.setAdapter(mColListAdapter);
    return view;
}