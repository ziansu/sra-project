private int calc(demo.parallel.Complex comp) {
    int count = 0;
    demo.parallel.Complex c = new demo.parallel.Complex(0, 0);
    do {
        c = c.times(c).cos().plus(comp).sin();
        count++;
    } while ((count < (demo.parallel.MandelbrotSetTask.CAL_MAX_COUNT)) && ((c.lengthSQ()) < (demo.parallel.MandelbrotSetTask.LENGTH_BOUNDARY)) );
    return count;
}