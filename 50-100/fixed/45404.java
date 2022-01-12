public int countPaymentFiles(long groupId, int paymentStatus, java.lang.String keywords) {
    java.lang.String[] names = null;
    boolean andOperator = false;
    if (com.liferay.portal.kernel.util.Validator.isNotNull(keywords)) {
        names = new java.lang.String[]{ com.liferay.portal.kernel.util.StringUtil.quote(com.liferay.portal.kernel.util.StringUtil.toLowerCase(keywords).trim(), StringPool.PERCENT) };
    }else {
        andOperator = true;
    }
    return _countPaymentFiles(groupId, paymentStatus, andOperator, names);
}