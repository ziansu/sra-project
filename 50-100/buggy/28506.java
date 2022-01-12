@org.junit.Test
public void onCreate_should_initializeActivityAndApplicationCorrectly() {
    org.tlc.whereat.activities.MainActivity a = createActivity(org.tlc.whereat.activities.MainActivity.class);
    assertThat(a.mLocPub).isNotNull();
    assertThat(a.mReceivers).isNotNull();
    assertThat(a.mSecAlert).isNotNull();
    assertThat(a.mMenu).isNotNull();
    assertThat(a.mPolling).isFalse();
    assertThat(a.mSecAlerted).isFalse();
    assertThat(org.robolectric.shadows.ShadowPreferenceManager.getDefaultSharedPreferences(RuntimeEnvironment.application)).isNotNull();
    assertThat(a.findViewById(R.id.go_button)).isNotNull();
}