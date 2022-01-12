@org.junit.Before
public void initTest() {
    event = new com.innvo.domain.Event();
    event.setName(com.innvo.web.rest.EventResourceIntTest.DEFAULT_NAME);
    event.setDescription(com.innvo.web.rest.EventResourceIntTest.DEFAULT_DESCRIPTION);
    event.setDetails(com.innvo.web.rest.EventResourceIntTest.DEFAULT_DETAILS);
    event.setEventdate(com.innvo.web.rest.EventResourceIntTest.DEFAULT_EVENTDATE);
    event.setStatus(com.innvo.web.rest.EventResourceIntTest.DEFAULT_STATUS);
    event.setLastmodifiedby(com.innvo.web.rest.EventResourceIntTest.DEFAULT_LASTMODIFIEDBY);
    event.setLastmodifieddate(com.innvo.web.rest.EventResourceIntTest.DEFAULT_LASTMODIFIEDDATE);
    event.setDomain(com.innvo.web.rest.EventResourceIntTest.DEFAULT_DOMAIN);
}