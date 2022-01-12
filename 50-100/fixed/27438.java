public synchronized void setOptions(java.util.ArrayList<gui.Button> options, entity.AbstractEntity entity) {
    if (options != null) {
        for (int i = 0; i < (options.size()); i++) {
            options.get(i).setSize(30, 30);
        }
    }
    calledby = entity;
    this.options = options;
}