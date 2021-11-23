public void update(ru.job4j.model.Item updated) {
    for (int i = 0; i < (this.position); i++) {
        if (this.items[i].getId().equals(updated.getId())) {
            this.items[i] = updated;
        }
    }
}