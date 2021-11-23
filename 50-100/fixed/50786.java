private boolean typeCheck(java.lang.String dataType) {
    obj_type = null;
    boolean type = false;
    dataType = dataType.toUpperCase();
    for (models.ObjectType obj : models.ObjectType.values()) {
        if (obj.toString().equals(dataType)) {
            type = true;
            obj_type = obj;
        }
    }
    return type;
}