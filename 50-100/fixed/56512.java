@java.lang.Override
public void find() {
    if (this.pesquisandoPorSolicitante) {
        this.lsEntity.clear();
        this.lsEntity.addAll(this.emprestimoService.findByPendenciasDoSolicitanteId(solicitantePesquisado.getId()));
        this.pesquisandoPorSolicitante = java.lang.Boolean.FALSE;
    }else
        if ((!(javax.faces.context.FacesContext.getCurrentInstance().isPostback())) || (((getId()) != null) && ((getId()) > 0))) {
            super.find();
        }
    
}