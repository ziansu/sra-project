@org.junit.Test
public void deveAtualizarPontosDoUsuario() throws java.lang.Exception, java.sql.SQLException {
    com.coursera.forum.model.Usuario usuario = this.criaUsuario("user", "User", 10);
    this.dao.inserir(usuario);
    this.dao.adicionarPontos("user", 50);
    org.dbunit.dataset.ITable currentTable = this.getCurrentTable();
    org.dbunit.dataset.ITable expectedTable = this.getModifiedTable(com.coursera.forum.dao.UsuarioDAOTest.VERIFICA_UPDATE_XML_LOCATION);
    org.dbunit.Assertion.assertEquals(expectedTable, currentTable);
}