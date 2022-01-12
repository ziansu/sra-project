@org.junit.Test
public void afterClosingWeGetAfreshLink() throws java.lang.Exception {
    java.net.URI randomURI = getRandomURI();
    org.ardulink.core.Link link1 = createConnectionBasedLink(randomURI);
    org.ardulink.core.Link link2 = createConnectionBasedLink(randomURI);
    org.ardulink.core.convenience.LinksTest.assertAllSameInstances(link1, link2);
    close(link1, link2);
    org.ardulink.core.Link link3 = createConnectionBasedLink(randomURI);
    assertThat(link3, org.hamcrest.core.IsNot.not(org.hamcrest.core.IsSame.sameInstance(link1)));
    assertThat(link3, org.hamcrest.core.IsNot.not(org.hamcrest.core.IsSame.sameInstance(link2)));
    close(link3);
}