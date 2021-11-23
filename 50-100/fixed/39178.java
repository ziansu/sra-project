public void setOrigin(org.eclipse.emf.henshin.model.Node origin) {
    this.origin = origin;
    if (origin != null) {
        if ((origin.eContainer()) != null) {
            originLayout = HenshinLayoutUtil.INSTANCE.getLayout(origin);
            orgGraph = origin.getGraph();
        }
    }
}