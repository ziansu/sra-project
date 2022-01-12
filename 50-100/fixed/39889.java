@java.lang.Override
public void onSuccess(java.util.List<org.ednovo.gooru.application.shared.model.content.CollectionVisibilityDo> classPageListDo) {
    if ((classPageListDo.size()) == 20) {
        totalClassesCountVal = (initialOffset) + (limitClasses);
        initialOffset = (initialOffset) + 20;
    }else {
        totalClassesCountVal = 0;
    }
    if ((classPageListDo.size()) > 0) {
        setClassesList(classPageListDo);
    }
}