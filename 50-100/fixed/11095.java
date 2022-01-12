public boolean updateIndentString(com.hlz.webModel.IndentModel model, java.lang.String reserve, java.lang.String fulfill) {
    com.hlz.entity.Indent indent = dao.updateIndent(model, reserve, fulfill);
    if (indent != null) {
        messaging.convertAndSend("/topic/update", indent.getId());
        rabbitTemplate.convertAndSend("update-indent", indent.getId());
        return true;
    }else {
        return false;
    }
}