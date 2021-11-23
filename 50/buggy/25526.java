@java.lang.Override
public void onCancel(javafx.scene.control.Tab tab) {
    com.innopolis.al_dente.MainView view = com.innopolis.al_dente.MainView.getInstance(sample.App.getParent(), this);
    view.closeTab(tab);
}