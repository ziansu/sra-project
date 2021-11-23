public ch.mobop.mse.vtrack.model.VoucherValidityStatusEnum getValidityStatus() {
    if (org.joda.time.DateTime.now().isBefore(dateOfexpiration.minusMonths(1))) {
        return VoucherValidityStatusEnum.valid;
    }else
        if (org.joda.time.DateTime.now().isBefore(dateOfexpiration)) {
            return VoucherValidityStatusEnum.soonToExpire;
        }else {
            return VoucherValidityStatusEnum.expired;
        }
    
}