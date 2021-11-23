public void rebuildTickHashMap() {
    tickHashMap = new java.util.HashMap<>();
    if ((getSkin()) == null) {
        return ;
    }
    for (double i = sliderMinValue.get(); i <= (sliderMaxValue.get()); i += sliderTick.get()) {
        tickHashMap.put(new java.lang.Double(i), createTick(i));
    }
}