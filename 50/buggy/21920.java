@java.lang.Override
public void onResume() {
    if (isWaitingForSettingResult) {
        isWaitingForSettingResult = false;
        start_fall_detect_service();
        start_allow_find_location_service();
        return ;
    }
    super.onResume();
}