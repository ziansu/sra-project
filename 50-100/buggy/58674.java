@com.wacli.mobilelocationtracker.imeitracker.api.RequestMapping(value = "location/{imei}")
public com.wacli.mobilelocationtracker.imeitracker.model.ImeiLocation getImeiLocation(@com.wacli.mobilelocationtracker.imeitracker.api.PathVariable(value = "imei")
java.lang.String imei) {
    java.util.List<com.wacli.mobilelocationtracker.imeitracker.model.ImeiLocation> res = repo.getLocationsOrderedByTime(imei, new org.springframework.data.domain.PageRequest(0, 1));
    if ((res == null) || ((res.size()) == 0)) {
        return "{";
    }
    return repo.getLocationsOrderedByTime(imei, new org.springframework.data.domain.PageRequest(0, 1)).get(0);
}