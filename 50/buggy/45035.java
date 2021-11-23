@org.junit.Test
public void testInitShowHideProfileFalseCookieValue() {
    org.mockito.Mockito.when(mockCookies.getCookie(org.mockito.Matchers.eq(ProfilePresenter.USER_PROFILE_VISIBLE_STATE_KEY))).thenReturn("false");
    profilePresenter.initializeShowHideProfile(true);
    verifyProfileHidden();
}