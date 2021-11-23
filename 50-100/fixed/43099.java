@java.lang.Override
public void initView() {
    com.oblivion.day_account.dagger2.component.DaggerAccountFragmentComponent.builder().accountFragmentModule(new com.oblivion.day_account.dagger2.module.AccountFragmentModule(mActivity)).build().inject(this);
    presenter.getRawData();
    adapter = new com.oblivion.day_account.ui.fragment.adapter.AccountPagerAdapter();
    viewpager.setAdapter(adapter);
}