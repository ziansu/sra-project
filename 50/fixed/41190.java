private void updateBagFlags() {
    if ((listener) != null) {
        listener.setBagFlags(bagFlags.values());
    }
}