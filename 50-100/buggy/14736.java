@org.greenrobot.eventbus.Subscribe
public void onEventCalculateNumberOfQuizzes(com.matteoveroni.wordsremember.dictionary.events.vocable.EventCountDistinctVocablesWithTranslationsCompleted event) {
    numberOfQuestions = event.getNumberOfVocablesWithTranslation();
    if ((settings.getNumberOfQuestions()) > (numberOfQuestions)) {
        settings.setNumberOfQuestions(numberOfQuestions);
    }
    android.util.Log.d(com.matteoveroni.wordsremember.quizgame.model.QuizGameFindTranslationForVocableModel.TAG, ("Max number of quizzes creatable are: " + (settings.getNumberOfQuestions())));
    com.matteoveroni.wordsremember.quizgame.model.QuizGameFindTranslationForVocableModel.EVENT_BUS.post(new com.matteoveroni.wordsremember.quizgame.events.EventQuizModelInitialized());
}