@org.springframework.transaction.annotation.Transactional
public org.egov.tl.entity.FeeMatrix create(final org.egov.tl.entity.FeeMatrix feeMatrix) {
    final java.lang.String genUniqueNo = feeMatrix.genUniqueNo();
    feeMatrix.setUniqueNo(genUniqueNo);
    if (!(feeMatrix.getFeeMatrixDetail().isEmpty()))
        for (final org.egov.tl.entity.FeeMatrixDetail fd : feeMatrix.getFeeMatrixDetail())
            fd.setFeeMatrix(feeMatrix);
        
    
    return feeMatrixRepository.save(feeMatrix);
}