public static void criarTrabalho() {
    java.lang.Long anuncioId = br.uva.goldenservices.views.AnuncioView.getCurrentId();
    if ((anuncioId != null) && ((br.uva.goldenservices.views.TrabalhoView.trabalhoId) == null)) {
        golden.services.model.trabalhos.Trabalho trabalho = golden.services.http.ConnectorWebService.criarTrabalho(anuncioId.toString());
        if (trabalho == null) {
            br.uva.goldenservices.ui.Helper.alert("Erro ao criar trabalho");
            br.uva.goldenservices.ui.Helper.changeView(R.layout.visualizar_anuncio);
        }else {
            br.uva.goldenservices.views.TrabalhoView.trabalhoId = trabalho.getId();
            br.uva.goldenservices.views.TrabalhoView.iniciarTimerClienteAguardandoConfirmacao(trabalho);
        }
    }
}