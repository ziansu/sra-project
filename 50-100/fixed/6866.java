public java.util.List<com.JJ.controller.invoicemanagement.vo.InvoiceVO> getAllInvoiceByIdList(java.util.List<java.lang.Integer> idList) {
    if ((idList != null) && (!(idList.isEmpty()))) {
        com.JJ.model.InvoiceDbObjectExample invoiceDbObjectExample = new com.JJ.model.InvoiceDbObjectExample();
        invoiceDbObjectExample.createCriteria().andDeleteIndEqualTo(GeneralUtils.NOT_DELETED).andInvoiceIdIn(idList);
        invoiceDbObjectExample.setOrderByClause("invoice_date desc");
        return convertToInvoiceVOList(invoiceDbObjectMapper.selectByExample(invoiceDbObjectExample));
    }
    return new java.util.ArrayList<com.JJ.controller.invoicemanagement.vo.InvoiceVO>();
}