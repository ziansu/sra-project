@java.lang.Override
public durscht.contracts.data.IBar createNewBar(java.lang.String name, double latitude, double longitude, java.lang.String description, java.lang.String url) throws java.lang.IllegalStateException {
    durscht.contracts.data.IDataHandler dataHandler = getDataHandler();
    durscht.contracts.data.IBar ibar = dataHandler.createBar(name, latitude, longitude, description, url);
    return durscht.core.BarHandler.convertDBtoUI(ibar, latitude, longitude);
}