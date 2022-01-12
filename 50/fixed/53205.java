public <T> void transactional(me.gerenciar.sdao.factory.DAOFactory.Runnable<T> runnable) {
    transactional(runnable, null, null, null, null, null);
}