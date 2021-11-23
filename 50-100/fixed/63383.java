@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onCreate(cbstudios.coffeebreak.eventbus.OnCreateEvent event) {
    if ((event.object) instanceof cbstudios.coffeebreak.view.activity.IMainView) {
        mainView = ((cbstudios.coffeebreak.view.activity.IMainView) (event.object));
        mainView.setCategories(model.getToDoDataModule().getLabelCategories(), model.getToDoDataModule().getTimeCategories());
        mainView.setTaskAdapter(taskAdapter);
        taskAdapter.updateTasks();
        taskAdapter.filterTasks();
        mainView.setNavDrawer();
        mainView.setToolbar();
    }
}