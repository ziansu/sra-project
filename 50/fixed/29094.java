private void update() {
    if (!(uptodate)) {
        summary.clear();
        distinctTraces.clear();
        traces.clear();
        addTraces(allTraces, false);
        uptodate = true;
    }
}