public void retainAll(LinkedQueue other) {
    if (!(this.isEmpty())) {
        int size = this.size();
        for (int i = 0; i < size; i++) {
            if (!(other.contains(((E) (this.nodeAt(i).data))))) {
                this.remove(i);
                i--;
            }
        }
    }
}