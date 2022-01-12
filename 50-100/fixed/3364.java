private void getBusData() {
    model = ((dat255.chalmers.stormystreet.GlobalState) (getApplication())).getModel();
    java.lang.String vinNumber = getIntent().getStringExtra(Constants.EXTRA_BUS_INFO_BUS_ID);
    try {
        if (vinNumber != null) {
            busInfo = model.getBus(java.lang.Integer.parseInt(vinNumber));
            if ((busInfo) == null) {
                throw new dat255.chalmers.stormystreet.model.bus.BusNotFoundException();
            }
        }else {
            throw new dat255.chalmers.stormystreet.model.bus.BusNotFoundException();
        }
    } catch (dat255.chalmers.stormystreet.model.bus.BusNotFoundException e) {
        finish();
    }
}