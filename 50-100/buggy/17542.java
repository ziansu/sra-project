@javax.annotation.PostConstruct
public void prepararPesquisa() {
    try {
        io.github.samirsales.dao.FabricanteDAO dao = new io.github.samirsales.dao.FabricanteDAO();
        java.util.ArrayList<io.github.samirsales.domain.Fabricante> arrayList = dao.listar();
        items = new javax.faces.model.ListDataModel<io.github.samirsales.domain.Fabricante>(arrayList);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        io.github.samirsales.util.JSFUtil.adicionarMensagemErro(e.getMessage());
    }
}