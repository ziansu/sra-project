public void apply(javafx.event.ActionEvent actionEvent) {
    if (((this.checkbox.isSelected()) && (this.changedMins())) || (this.changedstate)) {
        this.c.babystepsOutput(this.checkbox.isSelected(), java.lang.Double.parseDouble(this.minutes));
        this.stage.close();
    }
}