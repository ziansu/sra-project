public void definirControle(prs.mecanica.fase.telas.jogo.comuns.contratos.geral.ControleJogador controleJogador) {
    if (prs.mecanica.fase.global.Configuracao.getInstance().isMobile()) {
        this.controlerAtual = new prs.mecanica.fase.telas.jogo.atores.controle.ControleMobile(controleJogador);
    }else {
        this.controlerAtual = new prs.mecanica.fase.telas.jogo.atores.controle.ControleDesktop(controleJogador);
    }
    prs.mecanica.fase.global.RegistradorInputProcessors.getInstance().adicionarControlavel(this);
}