@org.junit.After
public void tearDown() {
    verify(this.manager, this.descriptor, this.places, this.request, this.response, this.user, this.service);
}