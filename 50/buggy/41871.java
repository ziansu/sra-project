@org.junit.Before
public void setup() throws java.lang.Exception {
    java.lang.String resource = "SqlMapConfig.xml";
    java.io.InputStream inputStream = org.apache.ibatis.io.Resources.getResourceAsStream(resource);
    org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory = new org.apache.ibatis.session.SqlSessionFactoryBuilder().build(inputStream);
}