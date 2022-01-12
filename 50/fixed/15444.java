@java.lang.Override
public void onDrop(org.ednovo.gooru.client.mvp.dnd.Draggable draggable) {
    org.ednovo.gooru.client.mvp.assessments.play.resource.question.HTAnswerChoiceOptionView resourceVc = ((org.ednovo.gooru.client.mvp.assessments.play.resource.question.HTAnswerChoiceOptionView) (draggable.getDraggableUc()));
    if (resourceVc != null) {
        resourceVc.reorderCollectionItem(1);
    }
}