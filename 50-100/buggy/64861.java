public void setRadioChecked(org.eyeseetea.malariacare.database.model.Option option) {
    if (((component) == null) || (!((component) instanceof android.widget.RadioGroup))) {
        return ;
    }
    ((org.eyeseetea.malariacare.views.CustomRadioButton) (component.findViewWithTag(option))).setChecked(true);
}