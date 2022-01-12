@java.lang.Override
public void OnAlbumFragmentInteraction(int pos) {
    mFragmentList.remove(1);
    vm.changeCurrentList(pos, 1);
    mFragmentList.add(com.vinay.vinplayer.fragments.AllSongsFragment.newInstance(1, vinMediaLists.getAlbumSongsList(VinMediaLists.allAlbums.get(pos).get("album"))));
    adapter = new com.vinay.vinplayer.views.MainActivity.ViewPagerAdapter(getSupportFragmentManager());
    viewPager.setAdapter(adapter);
}