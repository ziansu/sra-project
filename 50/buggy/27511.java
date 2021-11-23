private io.ray.hexis.QuadrantFragment getSpecificFragment(int quadrantId) {
    io.ray.hexis.QuadrantFragmentPagerAdapter adapter = ((io.ray.hexis.QuadrantFragmentPagerAdapter) (pager.getAdapter()));
    pager.setOffscreenPageLimit(4);
    return ((io.ray.hexis.QuadrantFragment) (adapter.getItem(quadrantId)));
}