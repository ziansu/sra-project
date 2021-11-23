public at.searles.fractview.fractal.Fractal pop() {
    this.current = null;
    return past.removeLast();
}