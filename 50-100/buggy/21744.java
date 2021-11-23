public net.sf.json.JSONObject fromEntity(org.wilson.world.model.Entity entity) {
    if (entity == null) {
        return null;
    }
    net.sf.json.JSONObject obj = new net.sf.json.JSONObject();
    obj.put("_id", entity.id);
    obj.put("name", entity.name);
    for (org.wilson.world.entity.EntityProperty property : properties.values()) {
        obj.put(property.name, entity.get(property.name));
    }
    return obj;
}