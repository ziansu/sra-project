@org.testng.annotations.Test
public void forceResize() {
    com.yahoo.sketches.frequencies.ItemsSketch<java.lang.String> sketch1 = new com.yahoo.sketches.frequencies.ItemsSketch<java.lang.String>((2 << (com.yahoo.sketches.frequencies.Util.LG_MIN_MAP_SIZE)));
    for (int i = 0; i < 32; i++) {
        sketch1.update(java.lang.Integer.toString(i), (i * i));
    }
}