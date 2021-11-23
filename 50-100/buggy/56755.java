public ru.job4j.model.Item findById(java.lang.String id) {
    ru.job4j.model.Item foundItem = null;
    for (int i = 0; i < (this.position); i++) {
        if (this.items[i].getId().equals(id)) {
            foundItem = this.items[i];
            break;
        }
    }
    return foundItem;
}