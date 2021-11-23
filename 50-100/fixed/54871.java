@java.lang.Override
public void updateUI(com.carltaylordev.recordlisterandroidclient.UserInterface.EditListing.RecordSessionManager sessionManager) {
    java.util.List<android.support.v4.app.Fragment> fragments = super.getActiveFragments(mFragList);
    for (android.support.v4.app.Fragment frag : fragments) {
        if (frag instanceof com.carltaylordev.recordlisterandroidclient.UserInterface.EditListing.RecordSessionManager.UpdateUiInterface) {
            ((com.carltaylordev.recordlisterandroidclient.UserInterface.EditListing.RecordSessionManager.UpdateUiInterface) (frag)).updateUI(sessionManager);
        }
    }
}