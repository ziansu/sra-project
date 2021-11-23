@java.lang.Override
public void onBinBtnClick(es.ulpgc.eite.clean.mvp.sample.listDoneMaster.Task_Adapter adapter) {
    int size = posSelected.size();
    if (size != 0) {
        for (int i = 0; i < size; i++) {
            es.ulpgc.eite.clean.mvp.sample.listDoneMaster.TaskRepository.getInstance().deleteTask(tasksSelected.get(i));
            adapter.remove(tasksSelected.get(i));
        }
        deselectAll();
        checkSelection();
    }
    checkAddBtnVisibility();
    checkDeleteBtnVisibility();
    checkDoneBtnVisibility();
}