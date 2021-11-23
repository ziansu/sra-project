@java.lang.Override
public void onComplete() {
    progressDialog.dismiss();
    radonsoft.mireaassistant.helpers.Global.scheduleNamesOdd = scheduleNamesOdd;
    radonsoft.mireaassistant.helpers.Global.scheduleRoomsOdd = scheduleRoomsOdd;
    radonsoft.mireaassistant.helpers.Global.scheduleTeachersOdd = scheduleTeachersOdd;
    radonsoft.mireaassistant.helpers.Global.scheduleTypeOdd = scheduleTypeOdd;
}