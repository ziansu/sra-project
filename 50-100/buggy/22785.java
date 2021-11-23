@java.lang.Override
public br.edu.ifsp.dsw.model.Tarefa buscarTarefaPorId(java.lang.Long id) {
    org.hibernate.Session session = this.sessionFactory.getCurrentSession();
    br.edu.ifsp.dsw.model.Tarefa tarefa = ((br.edu.ifsp.dsw.model.Tarefa) (session.load(br.edu.ifsp.dsw.model.Tarefa.class, id)));
    br.edu.ifsp.dsw.dao.impl.TarefaDAOImpl.logger.info(("Tarefa carregada com sucesso, detalhes=" + tarefa));
    return tarefa;
}