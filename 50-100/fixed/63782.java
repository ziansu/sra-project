private void loadDefaultFragments() {
    loadFragment(null, com.vwo.sampleapp.fragments.FragmentOnBoardingMain.CONTROL_LOGIN_TYPE_NORMAL, null);
    java.lang.String value = ((java.lang.String) (com.vwo.mobile.VWO.getVariationForKey(Constants.VWOKeys.KEY_LOGIN, Constants.VWOKeys.VALUE_EMAIL)));
    switch (value) {
        case Constants.VWOKeys.VALUE_EMAIL :
            loadFragment(null, com.vwo.sampleapp.fragments.FragmentOnBoardingMain.VARIATION_LOGIN_TYPE_NORMAL, null);
            break;
        case Constants.VWOKeys.VALUE_SKIP :
            loadFragment(null, com.vwo.sampleapp.fragments.FragmentOnBoardingMain.VARIATION_LOGIN_TYPE_SKIP, null);
            break;
        case Constants.VWOKeys.VALUE_SOCIAL_MEDIA :
            loadFragment(null, com.vwo.sampleapp.fragments.FragmentOnBoardingMain.VARIATION_LOGIN_TYPE_SOCIAL, null);
            break;
        default :
            loadFragment(null, com.vwo.sampleapp.fragments.FragmentOnBoardingMain.VARIATION_LOGIN_TYPE_NORMAL, null);
    }
}