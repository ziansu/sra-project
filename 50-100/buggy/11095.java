public boolean updateIndentString(com.hlz.webModel.IndentModel model, java.lang.String reserve, java.lang.String fulfill) {
    com.hlz.entity.Indent indent = dao.updateIndent(model, reserve, fulfill);
    if (indent != null) {
        messaging.convertAndSend("/topic/update", indent);
        rabbitTemplate.convertAndSend("update-indent", indent);
        return true;
    }else {
        return false;
    }
}