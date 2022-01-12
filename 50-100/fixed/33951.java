public void removeTrap() {
    java.util.Collection<model.InfluenceTile> list = getSet(1);
    for (model.InfluenceTile it : list) {
        if ((it.getTrap()) != null) {
            model.Trap tr = it.getTrap();
            tr.destroy();
            tr = null;
        }
    }
}