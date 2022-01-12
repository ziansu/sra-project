private void loadFragments() {
    java.lang.String value = ((java.lang.String) (com.vwo.mobile.VWO.getVariationForKey(Constants.VWOKeys.KEY_LAYOUT, Constants.VWOKeys.VALUE_LIST)));
    switch (value) {
        case Constants.VWOKeys.VALUE_LIST :
            loadFragment(null, com.vwo.sampleapp.fragments.FragmentSortingMain.ID_LIST_VARIATION, null);
            break;
        case Constants.VWOKeys.VALUE_GRID :
            loadFragment(null, com.vwo.sampleapp.fragments.FragmentSortingMain.ID_GRID_VARIATION, null);
            break;
        default :
            loadFragment(null, com.vwo.sampleapp.fragments.FragmentSortingMain.ID_LIST_VARIATION, null);
            break;
    }
    loadFragment(null, com.vwo.sampleapp.fragments.FragmentSortingMain.ID_LIST_CONTROL, null);
}