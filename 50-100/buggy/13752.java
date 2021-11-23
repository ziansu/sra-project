@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mainFrame = ((android.widget.FrameLayout) (getActivity().getLayoutInflater().inflate(R.layout.quizapp_layout, null)));
    ((com.amcolabs.quizapp.appcontrollers.UserMainPageController) (loadAppController(com.amcolabs.quizapp.appcontrollers.UserMainPageController.class))).checkAndShowCategories();
    setNotificationProcessingState(NotifificationProcessingState.CONTINUE);
    return mainFrame;
}