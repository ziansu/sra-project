@java.lang.Override
public void onComplete() {
    radonsoft.mireaassistant.helpers.Global.scheduleNamesEven = scheduleNamesEven;
    radonsoft.mireaassistant.helpers.Global.scheduleRoomsEven = scheduleRoomsEven;
    radonsoft.mireaassistant.helpers.Global.scheduleTeachersEven = scheduleTeachersEven;
    radonsoft.mireaassistant.helpers.Global.scheduleTypeEven = scheduleTypeEven;
    progressDialog.dismiss();
}