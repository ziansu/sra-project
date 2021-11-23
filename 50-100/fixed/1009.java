@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    addSwipeSpecialView(binding.viewPager);
    model = new com.zk.sample.module.card.holder.VM_DemoCardFragment(this, binding, this);
    binding.setViewModel(model);
    binding.viewPager.addOnPageChangeListener(model.getOnPageChangeListener());
    binding.viewPager.setAdapter(model.getAdapter());
    binding.viewPager.setPageMargin(com.zk.baselibrary.util.UIUtil.dip2px(getContext(), 5));
    binding.viewPager.setOffscreenPageLimit(3);
    ((com.zk.sample.base.BaseActivity) (getActivity())).addSwipeSpecialView(binding.viewPager);
}