public boolean createIndent(com.hlz.webModel.IndentModel model) {
    if (!(dao.addIndent(model))) {
        return false;
    }else {
        int count = dao.countIndent();
        model.setId(count);
        messaging.convertAndSend("/topic/add", "1");
        rabbitTemplate.convertAndSend("indent", "1");
        return true;
    }
}