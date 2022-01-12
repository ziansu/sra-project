@java.lang.Override
public void handle(se.kth.app.GBEB.HistoryRequest historyRequest, se.sics.ktoolbox.util.network.KContentMsg kContentMsg) {
    se.kth.app.GBEB.GBEB.LOG.info(((("I am " + (selfAdr)) + " and will send a history response to ") + (kContentMsg.getHeader().getSource())));
    trigger(kContentMsg.answer(new se.kth.app.GBEB.HistoryResponse(pasts)), networkPort);
}