public void novo() {
    try {
        io.github.samirsales.dao.FabricanteDAO dao = new io.github.samirsales.dao.FabricanteDAO();
        dao.salvar(fabricante);
        items = dao.listar();
        io.github.samirsales.util.JSFUtil.adicionarMensagemSucesso("Fabricante salvo com sucesso!");
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        io.github.samirsales.util.JSFUtil.adicionarMensagemErro(e.getMessage());
    }
}