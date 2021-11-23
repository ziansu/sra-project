@java.lang.Override
public void onClick(android.view.View v) {
    boolean isChecked = ((android.widget.CheckBox) (v)).isChecked();
    mainActivity.playerData.setReady(isChecked);
    mainActivity.sendReadyDataToOthers();
}