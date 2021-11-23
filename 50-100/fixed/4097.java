public void copy(org.eclipse.ice.datastructures.form.Material material) {
    if ((material != null) && (material != (this))) {
        this.name = material.name;
        this.properties = new java.util.HashMap<java.lang.String, java.lang.Double>(material.properties);
        this.components = new java.util.HashMap<java.lang.String, org.eclipse.ice.datastructures.form.MaterialStack>(material.components);
    }
}