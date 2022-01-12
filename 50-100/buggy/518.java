@java.lang.Override
protected void init() {
    androidlab.edu.cn.nucyixue.ui.teachPack.live.TeachLiveFragment mLive = androidlab.edu.cn.nucyixue.ui.teachPack.live.TeachLiveFragment.INSTANCE;
    androidlab.edu.cn.nucyixue.ui.teachPack.map.TeachMapFragment mNear = androidlab.edu.cn.nucyixue.ui.teachPack.map.TeachMapFragment.INSTANCE;
    androidlab.edu.cn.nucyixue.ui.teachPack.source.TeachSourceFragment mSource = androidlab.edu.cn.nucyixue.ui.teachPack.source.TeachSourceFragment.getInstance();
    mFragmentList.add(mLive);
    mFragmentList.add(mSource);
    mFragmentList.add(mNear);
    androidlab.edu.cn.nucyixue.ui.teachPack.TeachFragment.TeachFragmentPagerAdapter mTeachFragmentPagerAdapter = new androidlab.edu.cn.nucyixue.ui.teachPack.TeachFragment.TeachFragmentPagerAdapter(getChildFragmentManager(), mString, mFragmentList);
    mTeachMainViewpager.setAdapter(mTeachFragmentPagerAdapter);
    mTeachMainTablayout.setupWithViewPager(mTeachMainViewpager);
}