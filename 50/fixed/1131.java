@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/addresses_by_city")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<home.model.Address> addressesByCity(java.lang.Long id) {
    java.util.List<home.model.Address> addresses = null;
    try {
        addresses = repository.findByCity_Id(id);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return addresses;
}