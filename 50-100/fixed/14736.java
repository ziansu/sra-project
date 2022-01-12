@org.greenrobot.eventbus.Subscribe
public void onEventCalculateNumberOfQuizzes(com.matteoveroni.wordsremember.dictionary.events.vocable.EventCountDistinctVocablesWithTranslationsCompleted event) {
    numberOfQuestions = event.getNumberOfVocablesWithTranslation();
    if ((numberOfQuestions) > (settings.getNumberOfQuestions())) {
        numberOfQuestions = settings.getNumberOfQuestions();
    }
    android.util.Log.d(com.matteoveroni.wordsremember.quizgame.model.QuizGameFindTranslationForVocableModel.TAG, ("Max number of quizzes creatable are: " + (numberOfQuestions)));
    com.matteoveroni.wordsremember.quizgame.model.QuizGameFindTranslationForVocableModel.EVENT_BUS.post(new com.matteoveroni.wordsremember.quizgame.events.EventQuizModelInitialized());
}