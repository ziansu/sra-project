@java.lang.Override
public boolean isMogelijk(io.gameoftrades.model.markt.actie.HandelsPositie positie) {
    return (((positie.getStad().equals(handel.getStad())) && ((positie.getRuimte()) > 0)) && ((positie.getKapitaal()) >= (handel.getPrijs()))) && (positie.isActieBeschikbaar(1));
}