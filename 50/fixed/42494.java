public void add(Emir2.List other) {
    this.last.setNext(other.first);
    this.size += other.size();
}