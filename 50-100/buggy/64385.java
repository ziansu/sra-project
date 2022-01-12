@java.lang.Override
public void onBackPressed() {
    int count = getFragmentManager().getBackStackEntryCount();
    if (count > 0) {
        java.lang.String name = getFragmentManager().getBackStackEntryAt((count - 1)).getName();
        switch (name) {
            case "newsfeed" :
                thisFrag = "login";
                break;
            case "singlePost" :
                thisFrag = "newsfeed";
                break;
            default :
                thisFrag = "login";
                break;
        }
        invalidateOptionsMenu();
        this.getFragmentManager().popBackStack();
    }else {
        finish();
    }
}