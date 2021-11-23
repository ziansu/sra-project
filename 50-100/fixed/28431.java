public com.ozu.ozmo.ozmopol.Models.OzmoService ozmoService() {
    com.ozu.ozmo.ozmopol.Models.OzmoService service;
    if ((ozmoService) == null) {
        retrofit.RestAdapter restAdapter = new retrofit.RestAdapter.Builder().setEndpoint(OzmoService.base_url).build();
        ozmoService = restAdapter.create(com.ozu.ozmo.ozmopol.Models.OzmoService.class);
    }else {
    }
    return ozmoService;
}