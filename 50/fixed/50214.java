@org.junit.Test(expected = javax.enterprise.inject.AmbiguousResolutionException.class)
public void getInstanceOfTypedInterfaceWithoutPrecisingTheTypeWhereasSeveralImplementationAreProvided() {
    org.hamcrest.MatcherAssert.assertThat(anyApplicationServiceInstanceGetter.isAmbiguous(), is(true));
    anyApplicationServiceInstanceGetter.get();
}