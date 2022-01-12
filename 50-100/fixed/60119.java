@org.junit.Test
public void test02() throws java.io.IOException {
    com.querydslext.server.test.model.Dic dic = new com.querydslext.server.test.model.Dic();
    dic.setId(1L);
    com.querydslext.core.service.HQuery.select(_dic.id, _dic.dicKey).from(dic).or(com.querydslext.core.support.Or.create().eq(_dic.dicKey, "asdf").eq(_dic.dicKey, "ccc")).eq(_dic.id, 1L).list();
}