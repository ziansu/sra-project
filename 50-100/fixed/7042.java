private org.esbtools.message.admin.model.MetadataField searchField(org.esbtools.message.admin.model.MetadataField tree, org.esbtools.message.admin.model.MetadataField field) {
    org.esbtools.message.admin.model.MetadataField result = null;
    if ((tree != null) && (field != null)) {
        if (tree.getId().equals(field.getId())) {
            return tree;
        }else {
            for (org.esbtools.message.admin.model.MetadataField child : tree.getChildren()) {
                org.esbtools.message.admin.model.MetadataField dfsResult = searchField(child, field);
                if (dfsResult != null) {
                    return dfsResult;
                }
            }
        }
    }
    return result;
}