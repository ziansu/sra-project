private void messageUser(com.cooksys.assessment.model.Message message) throws com.fasterxml.jackson.core.JsonProcessingException {
    log.info("Got to messageUser");
    message.setTimestamp();
    java.lang.String response = mapper.writeValueAsString(message);
    writer.write(response);
    writer.flush();
}