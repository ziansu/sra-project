@org.junit.Test
public void testInitShowHideProfileTrueCookieValue() {
    org.mockito.Mockito.when(mockCookies.getCookie(org.mockito.Matchers.eq(ProfilePresenter.USER_PROFILE_VISIBLE_STATE_KEY))).thenReturn("true");
    profilePresenter.initializeShowHideProfile(true);
    verifyProfileShown();
}