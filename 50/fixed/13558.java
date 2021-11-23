@org.springframework.transaction.annotation.Transactional
public org.egov.tl.entity.FeeMatrix update(final org.egov.tl.entity.FeeMatrix feeMatrix) {
    feeMatrix.setUniqueNo(feeMatrix.genUniqueNo());
    return feeMatrixRepository.save(feeMatrix);
}