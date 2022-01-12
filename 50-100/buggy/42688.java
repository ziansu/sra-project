@java.lang.Override
public void handleMessage(android.os.Message message) {
    de.tbjv.rmxmc2.activity.ControllerActivity.trainList = de.ccck.rmxmobile.data_management.DataToGuiInterface.generateTrainNameList();
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(de.tbjv.rmxmc2.activity.ControllerActivity.context, R.layout.spinner_list_item, de.tbjv.rmxmc2.activity.ControllerActivity.trainList);
    adapter.setDropDownViewResource(R.layout.spinner_list_item);
    de.tbjv.rmxmc2.activity.ControllerActivity.trainSelector.setAdapter(adapter);
    if (!(de.tbjv.rmxmc2.activity.ControllerActivity.trainList.isEmpty())) {
        de.tbjv.rmxmc2.activity.ControllerActivity.currentTrain = 0;
        de.tbjv.rmxmc2.activity.ControllerActivity.trainName = de.tbjv.rmxmc2.activity.ControllerActivity.trainList.get(de.tbjv.rmxmc2.activity.ControllerActivity.currentTrain).toString();
    }
}