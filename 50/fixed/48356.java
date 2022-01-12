public <U> void addTo(java.util.function.Function<java.util.List<T>, U> func, eu.printingin3d.javascad.vrl.FrontBack<U> fb) {
    fb.addToFront(func.apply(front));
    fb.addToBack(func.apply(back));
}