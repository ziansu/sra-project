@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (which != (-1)) {
        org.md2k.study.model_view.day_type.DayTypeManager dayTypeManager = ((org.md2k.study.model_view.day_type.DayTypeManager) (org.md2k.study.controller.ModelManager.getInstance(this).getModel(ModelFactory.MODEL_DAY_TYPE)));
        dayTypeManager.setDayType(which);
        finish();
    }
}