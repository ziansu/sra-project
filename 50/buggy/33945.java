private boolean constrained() {
    return (released.getAndUpdate(( i) -> {
        return i < (maxReleased) ? ++i : i;
    })) < (maxReleased);
}