java.util.List<ru.urururu.sanity.Simulator.MachineState> advance() {
    paths = java.util.Collections.emptyList();
    ru.urururu.sanity.Cfe position = getPosition();
    try {
        ru.urururu.sanity.SourceRange sourceRange = position.getSourceRange();
        if (sourceRange != null) {
            ru.urururu.util.Coverage.hit(sourceRange.getFile(), ((sourceRange.getLine()) - 1));
        }
        position.accept(this);
        return paths;
    } catch (java.lang.Throwable e) {
        onError(position, e);
        return java.util.Collections.emptyList();
    }
}