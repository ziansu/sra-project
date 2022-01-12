public net.sf.json.JSONObject fromIndexEntity(org.wilson.world.model.Entity entity) {
    if (entity == null) {
        return null;
    }
    net.sf.json.JSONObject obj = new net.sf.json.JSONObject();
    for (org.wilson.world.entity.EntityProperty property : this.getIndexedProperties()) {
        obj.put(property.name, entity.get(property.name));
    }
    obj.put("_id", entity.id);
    obj.put("name", entity.name);
    return obj;
}