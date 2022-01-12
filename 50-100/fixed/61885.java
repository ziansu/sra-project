@java.lang.Override
public com.opinta.model.BarcodeInnerNumber generateForPostcodePool(com.opinta.model.PostcodePool postcodePool) {
    com.opinta.model.BarcodeInnerNumber barcodeInnerNumber = new com.opinta.model.BarcodeInnerNumber();
    barcodeInnerNumber.setStatus(com.opinta.model.BarcodeStatus.USED);
    barcodeInnerNumber.setNumber(barcodeGeneration.newInnerNumberFor(postcodePool.getPostcode()));
    sessionFactory.getCurrentSession().save(barcodeInnerNumber);
    return barcodeInnerNumber;
}