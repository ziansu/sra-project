@java.lang.Override
public com.opinta.model.BarcodeInnerNumber generateForPostcodePool(com.opinta.model.PostcodePool postcodePool) {
    com.opinta.model.BarcodeInnerNumber barcodeInnerNumber = new com.opinta.model.BarcodeInnerNumber();
    barcodeInnerNumber.setStatus(com.opinta.model.BarcodeStatus.USED);
    barcodeInnerNumber.setNumber(barcodeGeneration.newInnerNumberFor(postcodePool.getPostcode()));
    com.opinta.model.BarcodeInnerNumber saved = ((com.opinta.model.BarcodeInnerNumber) (sessionFactory.getCurrentSession().save(barcodeInnerNumber)));
    return saved;
}