@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_boutique_category);
    butterknife.ButterKnife.bind(this);
    cn.ucai.fulicenter.beans.BoutiqueBean boutiqueBean = getIntent().getParcelableExtra("BoutiqueBean");
    tvDescription.setText(boutiqueBean.getName());
    super.onCreate(savedInstanceState);
    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, cn.ucai.fulicenter.fragments.NewGoodsFragment.newInstance(((boutiqueBean.getId()) + ""), "")).commit();
    cn.ucai.fulicenter.utils.DisplayUtils.initBack(this);
}