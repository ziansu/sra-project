@javax.annotation.PostConstruct
public void prepararPesquisa() {
    try {
        io.github.samirsales.dao.FabricanteDAO dao = new io.github.samirsales.dao.FabricanteDAO();
        items = dao.listar();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        io.github.samirsales.util.JSFUtil.adicionarMensagemErro(e.getMessage());
    }
}