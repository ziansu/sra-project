@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.actv_most_complex_touch);
    cn.six.adv.touch.complex.frag.ViewPagerAdapter adapter = new cn.six.adv.touch.complex.frag.ViewPagerAdapter(getSupportFragmentManager());
    adapter.addFragment(new cn.six.adv.touch.complex.frag.MainFragment());
    adapter.addFragment(new cn.six.adv.touch.complex.frag.DragableGvFragment());
    adapter.addFragment(new cn.six.adv.touch.complex.frag.AboutUsFragment());
    adapter.addFragment(new cn.six.adv.touch.complex.frag.AboutUsFragment());
    vp = ((android.support.v4.view.ViewPager) (findViewById(R.id.vp_most_complex_touch)));
    vp.setAdapter(adapter);
}