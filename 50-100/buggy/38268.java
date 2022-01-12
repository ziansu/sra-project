private void setConfiguration(int id, java.lang.String name, java.lang.String desc) {
    int defaultFpNumber = cz.fidentis.featurepoints.FacialPointType.values().length;
    if (id < 0) {
        id = defaultFpNumber;
    }else
        if (id <= defaultFpNumber) {
            landmarkIDspinner.setEnabled(false);
        }
    
    javax.swing.SpinnerNumberModel model = new javax.swing.SpinnerNumberModel(id, 0, java.lang.Integer.MAX_VALUE, 1.0);
    landmarkIDspinner.setModel(model);
    landmarkDescriptionField.setText(desc);
    landmarkNameField.setText(name);
}