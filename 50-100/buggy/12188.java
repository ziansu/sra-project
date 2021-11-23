public void addAllNumbers() {
    allHandles = new java.util.ArrayList<>();
    addAllDecimalNumbers();
    addAllHexNumbers();
    addAllWebColorNumbers();
    for (java.util.List<processing.mode.java.tweak.Handle> handle : allHandles) {
        java.util.Collections.sort(handle, new processing.mode.java.tweak.HandleComparator());
    }
}