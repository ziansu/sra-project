@java.lang.Override
@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED, readOnly = false, rollbackFor = com.core.computism.assasa.exception.ArBusinessException.class)
public java.util.List<com.core.computism.assasa.ar.dto.PaymentTypeDto> getPaymentTypes() throws com.core.computism.assasa.exception.ArBusinessException {
    java.util.List<com.core.computism.assasa.ar.dto.PaymentTypeDto> paymentTypeDtos = new java.util.ArrayList<>();
    java.util.List<com.core.computism.assasa.persistence.entity.ar.PaymentType> paymentTypes = paymentTypeRepository.findAll();
    if (org.apache.commons.collections.CollectionUtils.isEmpty(paymentTypes)) {
        throw new com.core.computism.assasa.exception.ArBusinessException("Unable to find Payment Types");
    }
    for (com.core.computism.assasa.persistence.entity.ar.PaymentType paymentType : paymentTypes) {
        com.core.computism.assasa.ar.dto.PaymentTypeDto paymentTypeDto = new com.core.computism.assasa.ar.dto.PaymentTypeDto(paymentType);
        paymentTypeDtos.add(paymentTypeDto);
    }
    return paymentTypeDtos;
}