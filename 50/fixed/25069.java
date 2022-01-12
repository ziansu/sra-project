@java.lang.Override
public void onClick(android.view.View view) {
    publishNextWord();
    questionnaire.markKnown(currentTranslation);
}