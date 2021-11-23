@org.junit.Test
public void deveRetornarRankingDeUsuarios() {
    com.coursera.forum.model.Usuario usuario = this.criaUsuario("user", "User", 0);
    this.dao.inserir(usuario);
    java.util.List<com.coursera.forum.model.Usuario> ranking = this.dao.ranking();
    org.junit.Assert.assertNotNull(ranking);
    org.junit.Assert.assertFalse(ranking.isEmpty());
    org.junit.Assert.assertEquals(3, ranking.size());
}