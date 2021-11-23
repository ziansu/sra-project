public int addEntity(src.entityThings.Entity e, int x, int y) {
    e.setMapRelation(new src.model.MapEntity_Relation(this, e, x, y));
    int error_code = this.map_grid_[y][x].addEntity(e);
    if (error_code == 0) {
        this.entity_list_.put(e.name_, e);
    }else {
        e.setMapRelation(null);
    }
    items_list_.push(i);
    return error_code;
}