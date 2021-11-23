@org.junit.Test
public void test02() throws java.io.IOException {
    com.querydslext.server.test.model.Dic dic = new com.querydslext.server.test.model.Dic();
    dic.setId(1L);
    dic = com.querydslext.core.service.HQuery.select(_dic.id, _dic.dicKey).from(dic).eq(_dic.id).or(com.querydslext.core.support.Or.create().eq(_dic.dicKey, "asdf").eq(_dic.dicKey, "ccc")).uniqueResult();
    java.lang.System.out.println(dic);
}