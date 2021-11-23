@java.lang.Override
public boolean isMogelijk(io.gameoftrades.model.markt.actie.HandelsPositie positie) {
    return (((handel.getStad().equals(positie.getStad())) && ((positie.getRuimte()) > 0)) && ((positie.getKapitaal()) >= (handel.getPrijs()))) && (positie.isActieBeschikbaar(1));
}