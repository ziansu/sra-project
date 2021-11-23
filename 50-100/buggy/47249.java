public <U> void addTo(java.util.function.Function<java.util.List<T>, U> func, eu.printingin3d.javascad.vrl.FrontBack<U> fb) {
    fb.addToBack(func.apply(front));
    fb.addToFront(func.apply(back));
}