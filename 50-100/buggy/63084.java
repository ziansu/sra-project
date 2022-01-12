public void initialize() {
    this.orientationRadioGroup = new javafx.scene.control.ToggleGroup();
    this.orientationRadioGroup.getToggles().addAll(this.horizonalRadio, this.verticalRadio);
    this.orientationRadioGroup.selectToggle(this.verticalRadio);
    this.shipTypeSelectionBox.getItems().addAll(java.util.Arrays.asList(prog2_group7_battleships.enums.ShipType.values()));
}