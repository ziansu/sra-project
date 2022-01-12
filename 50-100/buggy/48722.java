@org.junit.Test
public void findByKeyWord() throws java.lang.Exception {
    java.util.List<java.lang.String> keywords = new java.util.ArrayList<>();
    keywords.add("惠普");
    keywords.add("HP");
    java.util.List<architecture.bean.CommodityBean> commodityBeans = commodityDao.findByKeyWord(keywords, (-1), (-1));
    java.lang.System.out.println(commodityBeans);
}