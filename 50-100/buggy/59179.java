@java.lang.Override
public void accept(TrainCart tc) {
    Train t = tc.getTrain();
    util.Color colorToUnload = t.getColor();
    util.Color cartColor = tc.getColor();
    if ((color.toString().equals(cartColor)) && (color.toString().equals(colorToUnload))) {
        tc.unload();
    }
    super.accept(tc);
}