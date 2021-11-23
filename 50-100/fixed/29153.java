static void setTamanhoDaFonte(float tamanho) {
    assert (br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_NORMAL) != null;
    br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_NORMAL = br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_NORMAL.deriveFont(tamanho);
    br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_DESTAQUE = br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_NORMAL.deriveFont(java.awt.Font.BOLD);
    if ((br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_DESTAQUE) == null) {
        br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_DESTAQUE = br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_NORMAL;
    }
    br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_CABECALHO = br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_NORMAL.deriveFont(12.0F);
    if ((br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_CABECALHO) == null) {
        br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_CABECALHO = br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_NORMAL;
    }
    br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_CABECALHO_DESTAQUE = br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_CABECALHO.deriveFont(java.awt.Font.BOLD);
    if ((br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_CABECALHO_DESTAQUE) == null) {
        br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_CABECALHO_DESTAQUE = br.univali.ps.ui.inspetor.RenderizadorBase.FONTE_NORMAL;
    }
}