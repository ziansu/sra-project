@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    mJsonApi.clearSkipLogicViews();
    mJsonApi.clearConstrainedViews();
    presenter.addFormElements();
    mJsonApi.refreshSkipLogic(null, null);
    mJsonApi.refreshConstraints(null, null);
}