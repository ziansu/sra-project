@org.springframework.transaction.annotation.Transactional
public void removerTarefa(java.lang.Integer id) {
    this.tarefaDAO.removerTarefa(id);
}