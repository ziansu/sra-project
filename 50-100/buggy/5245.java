public void insert(HuffmanNode n) {
    for (int i = 0; i < (list.size()); i++) {
        if ((list.get(i).getFrequency()) >= (n.getFrequency())) {
            list.add(i, n);
        }
    }
}