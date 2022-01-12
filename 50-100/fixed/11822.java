public boolean updateIndent(com.hlz.webModel.IndentModel model) {
    com.hlz.entity.Indent indent = dao.updateIndent(model);
    if (indent != null) {
        messaging.convertAndSend("/topic/update", indent.getId());
        rabbitTemplate.convertAndSend("update-indent", indent.getId());
        return true;
    }else {
        return false;
    }
}