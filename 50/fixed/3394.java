private void initData() {
    if (isStranger) {
        randos = com.github.randoapp.db.RandoDAO.getAllInRandos();
    }else {
        randos = com.github.randoapp.db.RandoDAO.getAllOutRandos();
    }
    size = randos.size();
}