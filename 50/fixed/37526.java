@java.lang.Override
public void setupComponent() {
    com.tixon.daggeractivitytests.app.IApp app = ((com.tixon.daggeractivitytests.app.IApp) (getApplication()));
    app.plusScreensComponent(this).inject(this);
}