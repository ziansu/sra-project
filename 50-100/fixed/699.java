public void initializeShowHideProfile(boolean isOwner) {
    if (isOwner) {
        boolean isProfileVisible = true;
        try {
            java.lang.String cookieValue = cookies.getCookie(org.sagebionetworks.web.client.presenter.ProfilePresenter.USER_PROFILE_VISIBLE_STATE_KEY);
            if ((cookieValue != null) && (!(cookieValue.isEmpty()))) {
                isProfileVisible = java.lang.Boolean.valueOf(cookieValue);
            }
        } catch (java.lang.Exception e) {
        }
        setIsProfileVisible(isProfileVisible, false);
    }else {
        setIsProfileVisible(true, false);
        view.setHideProfileButtonVisible(false);
    }
}