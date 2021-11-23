public static ca.wglabs.messageboard.dto.MessageDto toDto(ca.wglabs.messageboard.model.Message message) {
    ca.wglabs.messageboard.dto.MessageDto messageDto = new ca.wglabs.messageboard.dto.MessageDto();
    messageDto.setId(java.util.Objects.toString(message.getId(), ""));
    java.time.LocalDateTime ldt = java.time.LocalDateTime.ofInstant(message.getCreateDate().toInstant(), java.time.ZoneId.systemDefault());
    messageDto.setCreateDate(ldt);
    messageDto.setText(message.getText());
    return messageDto;
}