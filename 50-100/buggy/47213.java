@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onPresenterRequest(cbstudios.coffeebreak.eventbus.RequestPresenterEvent event) {
    if ((event.view) == (mContext)) {
        java.lang.System.out.println("Request Recieved");
        cbstudios.coffeebreak.controller.IPresenter mainPresenter = factory.createMainPresenter(((cbstudios.coffeebreak.view.activity.IMainView) (mContext)), model);
        cbstudios.coffeebreak.view.activity.MainActivity activity = ((cbstudios.coffeebreak.view.activity.MainActivity) (mContext));
        activity.mainPresenter = ((cbstudios.coffeebreak.controller.IMainPresenter) (mainPresenter));
        presenters.add(mainPresenter);
    }
}