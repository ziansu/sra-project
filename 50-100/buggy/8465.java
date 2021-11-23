public void controller(org.openmrs.ui.framework.fragment.FragmentModel model, @org.openmrs.ui.framework.annotation.SpringBean
org.openmrs.module.outgoingmessageexceptions.api.OutgoingMessageExceptionsService outgoingMessageExceptionsService, @org.openmrs.ui.framework.annotation.FragmentParam(value = "messageId", required = true)
java.lang.Integer messageId) throws java.io.IOException {
    java.lang.String message = outgoingMessageExceptionsService.getMessageById(messageId);
    if (org.apache.commons.lang.StringUtils.isBlank(message))
        model.addAttribute("outgoingMessage", null);
    else {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        mapper.setDateFormat(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS"));
        org.openmrs.module.outgoingmessageexceptions.OutgoingMessage outgoingMessage = mapper.readValue(message, org.openmrs.module.outgoingmessageexceptions.OutgoingMessage.class);
        model.addAttribute("outgoingMessage", outgoingMessage);
    }
}