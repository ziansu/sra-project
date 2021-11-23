@org.junit.Test
public void testSearchResultEqualRegexNotReturned() throws javassist.NotFoundException, javax.xml.registry.InvalidRequestException {
    contactService.save(new hello.model.Contact("^.*[aei].*$"));
    org.assertj.core.api.Assertions.assertThat(controller.findByKey("^.*[aei].*$", 1, requestForTest)).isEqualToIgnoringCase("No contacts found!");
}