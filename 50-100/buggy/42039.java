public java.util.List<com.pj.magic.model.Manufacturer> getAllItemProductManufacturers() {
    java.util.Set<com.pj.magic.model.Manufacturer> manufacturers = new java.util.HashSet<>();
    for (com.pj.magic.model.SalesRequisitionItem item : items) {
        manufacturers.add(item.getProduct().getManufacturer());
    }
    return com.pj.magic.util.ListUtil.asSortedList(new java.util.ArrayList(manufacturers));
}