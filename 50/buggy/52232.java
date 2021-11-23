@cz.muni.fi.pa165.rest.controller.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
@cz.muni.fi.pa165.rest.controller.RequestMapping(method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public final cz.muni.fi.pa165.dto.WeaponDTO createWeapon(@cz.muni.fi.pa165.rest.controller.RequestBody
cz.muni.fi.pa165.dto.WeaponDTO weapon) throws cz.muni.fi.pa165.rest.exception.RestException {
    weaponFacade.create(weapon);
    return weaponFacade.findById(weapon.getId());
}