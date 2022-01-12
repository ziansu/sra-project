@org.junit.Test
public void testPost() {
    com.manjesh.collector.domain.Event addEvent = new com.manjesh.collector.domain.Event(444, "Jai", "Ganesh", java.util.Arrays.asList(new com.manjesh.collector.domain.OID(1, "Ganesh"), new com.manjesh.collector.domain.OID(2, "Vignesh")));
    org.springframework.http.ResponseEntity<com.manjesh.collector.domain.Event> response = this.restTemplate.postForEntity("/event", addEvent, com.manjesh.collector.domain.Event.class, java.util.Collections.EMPTY_MAP);
    org.junit.Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
}