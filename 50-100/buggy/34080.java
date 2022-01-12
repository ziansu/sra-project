@java.lang.Override
public void onSuccess(org.ednovo.gooru.shared.model.content.CollectionDo result) {
    folderId = result.getGooruOid();
    title = result.getTitle();
    if (textToSave.equalsIgnoreCase("ideas")) {
        updateideasInfo(folderId, title, bigIdeasHTML.getText());
    }else
        if (textToSave.equalsIgnoreCase("questions")) {
            updatequestionsInfo(folderId, title, essentialQuestionsHTML.getText());
        }else {
            updateperformanceInfo(folderId, title, performanceTaskHTML.getText());
        }
    
}