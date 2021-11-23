public boolean isBust(int h) {
    return !(hand.get(h).isHandPlayable());
}