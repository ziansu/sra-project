@java.lang.Override
public boolean isMogelijk(io.gameoftrades.model.markt.actie.HandelsPositie positie) {
    if (!(handel.getStad().equals(positie.getStad()))) {
        return false;
    }
    if (!(positie.isActieBeschikbaar(1))) {
        return false;
    }
    java.lang.Integer value = positie.getVoorraad().get(handel.getHandelswaar());
    return (value != null) && (value > 0);
}