@java.lang.Override
public void onClick(android.view.View view) {
    publishNextWord();
    enableTranslationAndNotSubmittionButtons(true);
    questionnaire.markKnown(currentTranslation);
}