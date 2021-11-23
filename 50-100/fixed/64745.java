public void translate(int run, int rise) {
    x += run;
    y += rise;
    for (int i = 0; i < (images.size()); i++) {
        AnimationDemo.GameImage gi = images.get(i);
        gi.moveByAmount(run, rise);
    }
}