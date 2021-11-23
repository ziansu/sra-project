@java.lang.Override
public boolean conforms() {
    return ((net.imagej.ops.map.MapIterableIntervalToRAI.out()) == null) || (net.imglib2.util.Intervals.equalDimensions(net.imagej.ops.map.MapIterableIntervalToRAI.out(), net.imagej.ops.map.MapIterableIntervalToRAI.in()));
}