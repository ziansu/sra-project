public br.com.teclogica.roskowski.to.TORefeicao carregarRefeicao(br.com.teclogica.roskowski.enumeration.TiposRefeicoes cafeDaManha, br.com.teclogica.roskowski.interfaces.IManterRefeicaoSBean ssssBean, java.util.Date data) {
    return ssssBean.carregarData(getUsuarioSessao(), data, TiposRefeicoes.CAFE_DA_MANHA.getNome());
}