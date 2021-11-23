public void income(double value) {
    balance = new javafx.beans.property.SimpleDoubleProperty(((balance.get()) + value));
}