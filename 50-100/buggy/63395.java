public ch.mobop.mse.vtrack.model.VoucherValidityStatusEnum getValidityStatus() {
    if (dateOfexpiration.isBefore(org.joda.time.DateTime.now().minusMonths(1))) {
        return VoucherValidityStatusEnum.valid;
    }else
        if (dateOfexpiration.isBefore(org.joda.time.DateTime.now())) {
            return VoucherValidityStatusEnum.soonToExpire;
        }else {
            return VoucherValidityStatusEnum.expired;
        }
    
}