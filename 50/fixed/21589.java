@org.junit.Before
public void setUp() {
    mainActivity = org.robolectric.Robolectric.setupActivity(com.pencanware.cookr.activities.MainActivity.class);
    shadowActivity = org.robolectric.Shadows.shadowOf(mainActivity);
}