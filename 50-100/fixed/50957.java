public java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchPaymentFiles(long groupId, int paymentStatus, java.lang.String keywords, int start, int end) {
    java.lang.String[] names = null;
    boolean andOperator = false;
    if (com.liferay.portal.kernel.util.Validator.isNotNull(keywords)) {
        names = new java.lang.String[]{ com.liferay.portal.kernel.util.StringUtil.quote(com.liferay.portal.kernel.util.StringUtil.toLowerCase(keywords).trim(), StringPool.PERCENT) };
    }else {
        andOperator = true;
    }
    return _searchPaymentFiles(groupId, paymentStatus, andOperator, names, start, end);
}