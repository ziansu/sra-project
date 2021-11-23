public void orderByTargetDesc() {
    com.relax.mart.Session.qsort(this.targets, 0, this.targets.size(), this.instances);
    for (int i = 0; i < (this.instances.size()); i++) {
        this.instances.get(i).offset = i;
    }
}