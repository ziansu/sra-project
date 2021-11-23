public java.util.List<org.spongepowered.api.text.Text> subList(int fromIndex, int toIndex) {
    int from = (((this.size()) - 1) > fromIndex) ? fromIndex : (this.size()) - 1;
    int to = (((this.size()) - 1) > toIndex) ? toIndex : (this.size()) - 1;
    return this.items.subList(from, to);
}