public boolean updateIndent(com.hlz.webModel.IndentModel model) {
    com.hlz.entity.Indent indent = dao.updateIndent(model);
    if (indent != null) {
        messaging.convertAndSend("/topic/update", indent);
        rabbitTemplate.convertAndSend("update-indent", indent);
        return true;
    }else {
        return false;
    }
}