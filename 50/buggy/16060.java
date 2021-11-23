@org.junit.Test
public void testRepositoryUsernameFind() {
    com.UniGamer.uguser.dao.UGUser u = ugUserRepository.findByUsernameIs("unigamer");
    org.junit.Assert.assertNotNull(u);
}