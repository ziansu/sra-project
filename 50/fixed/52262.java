public void setObserver(java.util.List<GameObjects.Dot> list) {
    this.deleteObservers();
    for (GameObjects.Dot d : list) {
        this.addObserver(d);
    }
}