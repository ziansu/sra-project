public boolean checkValidId(short id, short data) {
    return (org.spout.api.material.MaterialData.getMaterial(id, data)) != null;
}