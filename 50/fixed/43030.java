@java.lang.Override
public void mutate2(final net.imglib2.IterableInterval<EA> in, final net.imglib2.IterableInterval<EA> arg) {
    net.imagej.ops.map.Maps.inplace(in, arg, net.imagej.ops.map.MapIIAndIIInplace.getOp());
}