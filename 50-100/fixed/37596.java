public boolean finishedIndentApp(java.lang.String id) {
    com.hlz.webModel.IndentStyle style = new com.hlz.webModel.IndentStyle();
    style.setId(java.lang.Integer.valueOf(id));
    style.setStyle(1);
    com.hlz.entity.Indent indent = dao.updateIndent(style);
    messaging.convertAndSend("/topic/style", id);
    rabbitTemplate.convertAndSend("indent", "1");
    return indent != null;
}