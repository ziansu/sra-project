@zab.romik.rest.PostMapping
public org.springframework.http.HttpStatus save(@zab.romik.rest.RequestBody
final zab.romik.entity.Commodity commodity) {
    commodityService.save(commodity);
    return org.springframework.http.HttpStatus.OK;
}