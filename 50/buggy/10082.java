@org.tekCorp.api.control.RequestMapping(value = "/add", method = RequestMethod.POST)
@org.tekCorp.api.control.ResponseBody
public org.tekCorp.api.domain.Type add(@org.tekCorp.api.control.RequestBody
org.tekCorp.api.domain.Type type) {
    org.tekCorp.api.domain.Type oriType = typeRepository.findByName(type.getNom());
    if (oriType != null) {
        return oriType;
    }
    type = typeRepository.save(type);
    return type;
}