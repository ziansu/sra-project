@java.lang.Override
public void attachView(com.matteoveroni.wordsremember.quizgame.view.QuizGameView view) {
    this.view = view;
    com.matteoveroni.wordsremember.quizgame.presenter.QuizGamePresenter.EVENT_BUS.register(this);
    model.registerToEventBus();
    model.reset();
    score = 0;
}