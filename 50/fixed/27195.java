@java.lang.Override
public interfaces.Quiz createQuiz(int userID) throws java.rmi.RemoteException {
    interfaces.Quiz newQuiz = new server.QuizImpl(userID, quizList.size());
    quizList.add(newQuiz);
    return newQuiz;
}