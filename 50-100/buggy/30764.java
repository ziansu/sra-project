private void validaDataDeDevolucao(br.edu.utfpr.labscontrol.model.entity.EmprestimoItem item) throws java.lang.IllegalArgumentException {
    java.lang.Long time1 = item.getEmprestimo().getData().getTime();
    java.lang.Long time2 = item.getDataDevolucao().getTime();
    if (time1 > time2) {
        throw new java.lang.IllegalArgumentException("Data de Devolução deve ser maior ou igual a Data do Empréstimo");
    }
}