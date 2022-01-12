@java.lang.Override
public void createTopic(java.lang.String topicName) {
    if (((topicName == null) || (topicName.isEmpty())) || ((topicName.length()) > (com.example.pao.testdit.mvp.form.FormPresenter.MAX_CHAR))) {
        mView.showFailedMessage();
        return ;
    }
    com.example.pao.testdit.model.Topic topic = new com.example.pao.testdit.model.Topic(topicName, 0);
    com.example.pao.testdit.util.TempStorageUtil.insert(topic);
    mView.showSuccessMessage();
    mView.navigateToHome();
}