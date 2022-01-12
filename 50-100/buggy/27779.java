@org.junit.Test
public void listByGeoLocation() {
    final org.springframework.data.geo.GeoPage<com.ninjas.movietime.core.domain.theater.Theater> theaters = theaterRepository.listByGeoLocation(new org.springframework.data.geo.Point(48.88366, 2.3272), new org.springframework.data.domain.PageRequest(0, 2));
    org.junit.Assert.assertThat(theaters.getContent(), org.hamcrest.Matchers.not(org.hamcrest.Matchers.empty()));
    org.junit.Assert.assertThat(theaters.getContent().size(), org.hamcrest.Matchers.is(2));
}