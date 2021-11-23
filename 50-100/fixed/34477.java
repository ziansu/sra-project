public static ca.wglabs.messageboard.dto.MessageDto toDto(ca.wglabs.messageboard.model.Message message) {
    ca.wglabs.messageboard.dto.MessageDto messageDto = new ca.wglabs.messageboard.dto.MessageDto();
    messageDto.setId(java.util.Objects.toString(message.getId(), ""));
    messageDto.setCreateDate(message.getCreateDate().getTime());
    messageDto.setText(message.getText());
    return messageDto;
}