@java.lang.Override
public void show() {
    Gdx.input.setInputProcessor(stage);
    if (nmu.isServer()) {
        new com.technohest.core.network.RServer(nmu.getPort());
        client = new com.technohest.core.network.RClient(nmu.getPort());
        client.addEventListener(screenHandler);
    }else {
        client = new com.technohest.core.network.RClient(nmu.getIp(), nmu.getPort());
        client.addEventListener(screenHandler);
    }
}