@java.lang.Override
public java.util.Dictionary<java.lang.Integer, java.lang.String> getQuestionList() throws java.rmi.RemoteException {
    java.util.Dictionary<java.lang.Integer, java.lang.String> questionsDictionary = new java.util.Hashtable<java.lang.Integer, java.lang.String>();
    for (int i = 0; i < (questionsList.size()); i++) {
        interfaces.Question current = questionsList.get(i);
        questionsDictionary.put(current.getQuestionId(), current.getQuestionText());
    }
    return questionsDictionary;
}