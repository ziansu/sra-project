public void run() {
    turnCard = util.getTurnCard(getApplicationContext(), nome_Colecao);
    img = util.getImages(getApplicationContext(), nome_Colecao);
    par = util.getParIntruso(getApplicationContext(), nome_Colecao);
    img.addAll(turnCard);
    img.addAll(par);
    final isec.memorygame.gridImageAdapter grid = new isec.memorygame.gridImageAdapter(getApplicationContext(), img);
    imageGallery.setAdapter(grid);
}