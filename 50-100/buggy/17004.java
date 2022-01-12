public void load() {
    this.data = ((TRPG.ModelData) (TRPG.Model.models.get(this.name)));
    if ((this.data) != null) {
        return ;
    }
    this.data = new TRPG.ModelData(this.name);
    TRPG.Model.models.put(this.name, this.data);
    return ;
}