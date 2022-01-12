@java.lang.Override
protected javafx.collections.ObservableList<com.dom.notificacao.model.entity.Notificacao> call() throws java.lang.Exception {
    javafx.collections.ObservableList<com.dom.notificacao.model.entity.Notificacao> n = user.listar(dao);
    for (int i = 0; i < 500; i++) {
        updateProgress(i, 500);
        java.lang.Thread.sleep(5);
    }
    return n;
}