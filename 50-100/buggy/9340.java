public void addToMyMaps(java.util.List<mikheev.konstantin.huntmap.models.RegionItem> regionItemListFromFragment) {
    for (mikheev.konstantin.huntmap.models.RegionItem regionItem : regionItemListFromFragment) {
        if (((regionItem != null) && (regionItem.getIsBought())) && (!(regionItemListFromFragment.contains(regionItem)))) {
            myRegionItemsMap.addRegionItem(regionItem.getRegionId(), regionItem);
        }
    }
    android.support.v4.app.Fragment fragmentMyMaps = myViewPagerAdapter.getFragmentByPosition(0);
    ((mikheev.konstantin.huntmap.fragments.MyMapsFragment) (fragmentMyMaps)).updateMyMapsItems(myRegionItemsMap.getRegionItemsList());
}