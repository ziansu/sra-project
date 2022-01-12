public boolean updateIndent(com.hlz.webModel.IndentModel model) {
    com.hlz.entity.Indent indent = dao.updateIndent(model);
    if (indent != null) {
        messaging.convertAndSend("/topic/update", ("updateIndent" + (indent.getId())));
        rabbitTemplate.convertAndSend("indent", "1");
        return true;
    }else {
        return false;
    }
}