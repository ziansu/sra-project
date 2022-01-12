@java.lang.Override
public boolean update(ch.bailu.aat.gpx.interfaces.GpxDeltaInterface delta) {
    if ((delta.getSpeed()) < (minSpeed)) {
        add += delta.getTimeDelta();
    }else {
        if ((add) > (time)) {
            pause += add;
        }
        add = 0;
    }
    return (add) < (time);
}