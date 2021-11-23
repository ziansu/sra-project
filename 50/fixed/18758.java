@java.lang.Override
public void onFinish(int result) {
    switch (result) {
        case Constants.ResultFinishLoadData.LOAD_DATA_FINISH :
            synChronizeData();
            break;
        case Constants.ResultFinishLoadData.LOAD_EVENT_FINISH :
            pushNotification();
            break;
    }
}