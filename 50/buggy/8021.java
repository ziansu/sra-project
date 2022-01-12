@org.junit.Before
public void setUp() {
    p = new edu.chl.LifeOfAGoblin.model.profile.Profile("Test");
    mockP = org.mockito.Mockito.mock(edu.chl.LifeOfAGoblin.model.profile.Profile.class);
    for (edu.chl.LifeOfAGoblin.model.profile.Profile p : edu.chl.LifeOfAGoblin.model.profile.Profile.getProfiles()) {
        edu.chl.LifeOfAGoblin.model.profile.Profile.removeProfile(p);
    }
}