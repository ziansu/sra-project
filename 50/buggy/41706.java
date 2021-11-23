@org.junit.Test
@org.junit.experimental.categories.Category(value = org.apache.beam.sdk.testing.NeedsRunner.class)
public void testDynamicDestinationsBounded() throws java.lang.Exception {
    testDynamicDestinationsHelper(true);
}