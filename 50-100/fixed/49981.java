public void retainAll(LinkedQueue other) {
    if (!(this.isEmpty())) {
        for (int i = 0; i < (this.size()); i++) {
            if (!(other.contains(((E) (this.nodeAt(i).data))))) {
                this.remove(i);
                i--;
            }
        }
    }
}