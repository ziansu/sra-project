public void apply(javafx.event.ActionEvent actionEvent) {
    if (((this.checkbox.isSelected()) && (this.changedMins())) || (this.changedstate)) {
        this.c.babystepsOutput(this.checkbox.isSelected(), ((double) (this.time.getValue())));
        this.stage.close();
    }
}