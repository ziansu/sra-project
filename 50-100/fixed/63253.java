public static com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant xmlToObject(java.lang.String xmlStr) {
    com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant merchant = null;
    try {
        javax.xml.bind.JAXBContext context = javax.xml.bind.JAXBContext.newInstance(com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant.class);
        javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
        merchant = ((com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant) (unmarshaller.unmarshal(new java.io.StringReader(xmlStr))));
    } catch (javax.xml.bind.JAXBException e) {
        java.lang.System.out.println("The exception");
        e.printStackTrace();
    }
    return merchant;
}