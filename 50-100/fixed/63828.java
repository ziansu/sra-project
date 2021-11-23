@java.lang.Override
public void onClick(android.view.View v) {
    org.md2k.study.model_view.day_start_end.DayStartEndInfoManager dayStartEndInfoManager = ((org.md2k.study.model_view.day_start_end.DayStartEndInfoManager) (model));
    org.md2k.study.Status status = dayStartEndInfoManager.getCurrentStatusDetails();
    if ((status.getStatus()) == (org.md2k.study.Status.DAY_START_NOT_AVAILABLE)) {
        showAlertDialog(Status.DAY_START_NOT_AVAILABLE);
    }else
        if ((status.getStatus()) == (org.md2k.study.Status.SUCCESS)) {
            showAlertDialog(Status.SUCCESS);
        }
    
}