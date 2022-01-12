public java.util.List<org.spongepowered.api.text.Text> subList(int fromIndex, int toIndex) {
    int from = ((this.size()) > fromIndex) ? fromIndex : this.size();
    int to = ((this.size()) > toIndex) ? toIndex : this.size();
    return this.items.subList(from, to);
}