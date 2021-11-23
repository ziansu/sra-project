public static org.openlca.app.cloud.index.Diff getDiff(org.openlca.cloud.model.data.Dataset dataset) {
    org.openlca.app.cloud.index.DiffIndex index = org.openlca.app.db.Database.getDiffIndex();
    if (index == null)
        return null;
    
    return index.get(dataset.refId);
}