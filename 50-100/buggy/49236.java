@javafx.fxml.FXML
private void onEncode() {
    java.lang.String leftInput = t_left.getText().trim();
    if (org.apache.commons.lang.StringUtils.isEmpty(leftInput)) {
        return ;
    }
    com.up.sim.commons.DigestType type = com.up.sim.commons.DigestType.get(comboBox_digest.getSelectionModel().getSelectedItem());
    java.lang.String encoded = com.up.sim.service.DigestService.getInstance().digest(leftInput, DigestType.MD5.value());
    t_right.setText(encoded);
}