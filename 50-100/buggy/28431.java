public com.ozu.ozmo.ozmopol.Models.OzmoService ozmoService() {
    com.ozu.ozmo.ozmopol.Models.OzmoService service;
    if ((this.ozmoService) != null) {
        retrofit.RestAdapter restAdapter = new retrofit.RestAdapter.Builder().setEndpoint(OzmoService.base_url).build();
        service = restAdapter.create(com.ozu.ozmo.ozmopol.Models.OzmoService.class);
        this.ozmoService = service;
    }else {
        service = ozmoService;
    }
    return service;
}