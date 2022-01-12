@org.springframework.web.bind.annotation.PostMapping
public zab.romik.entity.Commodity save(@javax.validation.Valid
final zab.romik.entity.Commodity commodity) {
    return commodityService.save(commodity);
}