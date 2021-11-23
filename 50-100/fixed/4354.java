@java.lang.Override
public java.util.List<interfaces.Question> getQuestionList() throws java.rmi.RemoteException {
    java.util.List<interfaces.Question> questionsDictionary = new java.util.ArrayList<interfaces.Question>();
    for (int i = 0; i < (questionsList.size()); i++) {
        interfaces.Question current = questionsList.get(i);
        questionsDictionary.add(current);
    }
    return questionsDictionary;
}