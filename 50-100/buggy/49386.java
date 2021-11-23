public org.egov.tl.masters.domain.model.FeeMatrix update(org.egov.tl.masters.domain.model.FeeMatrix previousFeeMatrix) {
    org.egov.tl.masters.persistence.entity.FeeMatrixEntity feeMatrixEntity = new org.egov.tl.masters.persistence.entity.FeeMatrixEntity();
    feeMatrixEntity = feeMatrixJdbcRepository.update(feeMatrixEntity.toEntity(previousFeeMatrix));
    for (org.egov.tl.masters.domain.model.FeeMatrixDetail feeMatrixDetail : previousFeeMatrix.getFeeMatrixDetails()) {
        feeMatrixDetailDomainRepository.update(new org.egov.tl.masters.persistence.entity.FeeMatrixDetailEntity().toEntity(feeMatrixDetail));
    }
    return feeMatrixEntity.toDomain();
}