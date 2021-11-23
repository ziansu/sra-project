@java.lang.Override
public void accept(TrainCart tc) {
    util.Color cartColor = tc.getColor();
    if (((hasPassengers) && (color.toString().equals(cartColor))) && (tc.isEmpty())) {
        tc.load();
        hasPassengers = false;
    }
    super.accept(tc);
}