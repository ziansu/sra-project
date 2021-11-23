public void preencheVagas() {
    boolean[] vagas = setor.vagas_Disponiveis();
    int progress = 0;
    for (int i = 0; i < 16; i++) {
        ++progress;
        if (vagas[i]) {
            paineis[i].setBackground(java.awt.Color.green);
        }else
            paineis[i].setBackground(java.awt.Color.red);
        
    }
    progress = (progress * 100) / 16;
    progressBar.setValue(progress);
}