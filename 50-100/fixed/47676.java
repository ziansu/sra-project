public void readList(java.lang.Iterable<NetEvent.messagecom.QuestionListMessage> listData) {
    while ((mymodel.getSize()) != 0)
        mymodel.removeElementAt(0);
    
    listData.forEach((NetEvent.messagecom.QuestionListMessage msg) -> {
        gui.ListElementData d = new gui.ListElementData(msg.getQuestionID(), "", "", "", "", msg.getQuestionDescription(), msg.getGood(), msg.getUserNum(), "");
        mymodel.addElement(d);
    });
}