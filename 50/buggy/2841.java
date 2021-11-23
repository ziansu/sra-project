@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "contact/search", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.data.domain.Page<by.itechart.flowerty.model.Contact> search(@org.springframework.web.bind.annotation.RequestBody
by.itechart.flowerty.model.Contact contact) {
    LOGGER.info("search contact");
    return contactService.getPage(1, 10);
}