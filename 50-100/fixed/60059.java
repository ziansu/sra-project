private void adjustParentSpecimenQty(java.math.BigDecimal qty) {
    java.math.BigDecimal parentQty = parentSpecimen.getAvailableQuantity();
    if (((parentQty != null) && (qty != null)) && (com.krishagni.catissueplus.core.common.util.NumUtil.greaterThanEquals(parentQty, qty))) {
        parentSpecimen.setAvailableQuantity(parentQty.subtract(qty));
    }
}