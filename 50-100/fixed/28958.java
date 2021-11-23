@java.lang.Override
public void run() {
    if (isRequesting) {
        return ;
    }else {
        isRequesting = true;
        com.example.por.project_test.BackgoundWorker backgoundWorker = new com.example.por.project_test.BackgoundWorker(this);
        backgoundWorker.execute("readmessagegroup", com.example.por.project_test.GroupMessageActivity.id, groupId, ((lastMessageId) + ""), com.example.por.project_test.GroupMessageActivity.token);
    }
}