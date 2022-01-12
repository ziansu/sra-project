public int[] getSinks() {
    return (reverse) != null ? reverse.getSource() : new int[0];
}