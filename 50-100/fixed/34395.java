@org.junit.Test
public void display_columnIdentifier() {
    onData(android.support.test.espresso.matcher.PreferenceMatchers.withKey(org.opendatakit.espresso.COLUMNS_LIST)).perform(android.support.test.espresso.action.ViewActions.click());
    onData(is("House id")).perform(android.support.test.espresso.action.ViewActions.click());
    assertThat(org.opendatakit.util.EspressoUtils.getPrefSummary(org.opendatakit.espresso.COL_DISPLAY_NAME), is("House id"));
    assertThat(org.opendatakit.util.EspressoUtils.getPrefSummary(org.opendatakit.espresso.COL_KEY), is("House_id"));
}