private void getMiniFields() {
    for (org.unicef.rapidreg.forms.Section section : sections) {
        for (org.unicef.rapidreg.forms.Field caseField : section.getFields()) {
            if (caseField.isShowOnMiniForm()) {
                if (caseField.isPhotoUploadBox()) {
                    miniFields.add(0, caseField);
                }else {
                    miniFields.add(caseField);
                }
            }
        }
    }
    addProfileFieldForDetailsPage();
}