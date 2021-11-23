private void estornarQuantidadeBaixada(br.edu.utfpr.labscontrol.model.entity.EmprestimoItem item) {
    br.edu.utfpr.labscontrol.model.entity.MaterialDeConsumo m = item.getMaterialDeConsumo();
    m.setQtdAtual(m.getQtdAtual().add(item.getQuantidadeBaixada()));
    try {
        materialDeConsumoService.save(m);
    } catch (java.lang.Exception e) {
        addMessage("Erro ao estornar estoque!", FacesMessage.SEVERITY_ERROR);
        e.printStackTrace();
    }
}