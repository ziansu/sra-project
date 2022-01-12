public void setModel(java.lang.String model) {
    java.lang.String validModel = model.toLowerCase();
    if ((validModel.equals("A8")) || (validModel.equals("rangeRover"))) {
        this.model = model;
    }else {
        this.model = "Unknown";
    }
    this.model = model;
}