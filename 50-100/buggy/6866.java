public java.util.List<com.JJ.controller.invoicemanagement.vo.InvoiceVO> getAllInvoiceByIdList(java.util.List<java.lang.Integer> idList) {
    com.JJ.model.InvoiceDbObjectExample invoiceDbObjectExample = new com.JJ.model.InvoiceDbObjectExample();
    invoiceDbObjectExample.createCriteria().andDeleteIndEqualTo(GeneralUtils.NOT_DELETED).andInvoiceIdIn(idList);
    invoiceDbObjectExample.setOrderByClause("invoice_date desc");
    return convertToInvoiceVOList(invoiceDbObjectMapper.selectByExample(invoiceDbObjectExample));
}