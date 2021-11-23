public static void incrementQuantity(int quantity, long id) {
    org.apache.ibatis.session.SqlSession session = com.devsolutions.camelus.services.DBConnection.getSqlSessionFactory().openSession();
    session.getMapper(com.devsolutions.camelus.mappers.ProductMapper.class).incrementQuantity(quantity, id);
    session.commit();
    session.close();
}