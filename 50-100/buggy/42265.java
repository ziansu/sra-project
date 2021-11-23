public void draw() {
    clear();
    this.translate(((width) / 2), ((height) / 2));
    treelang.TStorage.gI().get(root).draw(this);
    root = m.mutate(root);
}