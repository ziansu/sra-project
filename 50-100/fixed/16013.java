public void rebuildTickHashMap() {
    if ((getSkin()) == null) {
        return ;
    }
    tickHashMap = new java.util.HashMap<>();
    for (double i = sliderMinValue.get(); i <= (sliderMaxValue.get()); i += sliderTick.get()) {
        tickHashMap.put(i, createTick(i));
    }
}