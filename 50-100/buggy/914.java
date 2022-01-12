public java.math.BigDecimal getSalesByManufacturer(com.pj.magic.model.Manufacturer manufacturer) {
    java.math.BigDecimal total = com.pj.magic.Constants.ZERO;
    for (com.pj.magic.model.SalesRequisitionItem item : items) {
        if (item.getProduct().getManufacturer().equals(manufacturer)) {
            total = total.add(item.getAmount());
        }
    }
    return total;
}