@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.support.v4.view.ViewPager viewPager = ((android.support.v4.view.ViewPager) (view.findViewById(R.id.viewpager)));
    viewPager.setAdapter(new us.brandonandrews.nclottery.adapters.Pick4PagerAdapter(getFragmentManager(), getActivity()));
    android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (view.findViewById(R.id.sliding_tabs)));
    tabLayout.setupWithViewPager(viewPager);
}