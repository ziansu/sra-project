@java.lang.Override
public com.re.reverb.ui.OverlayFragment getItem(int i) {
    switch (i) {
        case 0 :
            return userProfileFragment;
        case 1 :
            return newFeedFragment;
        case 2 :
            return regionsFragment;
        default :
            return null;
    }
}