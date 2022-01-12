@java.lang.Override
public void onSuccess(org.ednovo.gooru.shared.model.content.CollectionDo result) {
    if (textToSave.equalsIgnoreCase("ideas")) {
        updateideasInfo(result.getGooruOid(), result.getTitle(), bigIdeasHTML.getText());
    }else
        if (textToSave.equalsIgnoreCase("questions")) {
            updatequestionsInfo(result.getGooruOid(), result.getTitle(), essentialQuestionsHTML.getText());
        }else {
            updateperformanceInfo(result.getGooruOid(), result.getTitle(), performanceTaskHTML.getText());
        }
    
}