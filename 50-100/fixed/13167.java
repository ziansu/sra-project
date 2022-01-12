@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "contact/details/{id}")
public by.itechart.flowerty.model.Contact details(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id) throws java.lang.Exception {
    LOGGER.info("get details about contact with id: {}", id);
    if ((id == null) || (id < 0)) {
        throw new java.lang.Exception("contact id cannot be negative or null");
    }
    by.itechart.flowerty.model.Contact contact = contactService.findOne(id);
    return contact;
}