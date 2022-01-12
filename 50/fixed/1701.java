public at.searles.fractview.fractal.Fractal removeLast() {
    this.current = null;
    return past.removeLast();
}