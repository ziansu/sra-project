@org.springframework.web.bind.annotation.RequestMapping(value = "/address_list", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.util.List<ua.netcracker.controller.Address>> getAllAddress() {
    java.util.List<ua.netcracker.controller.Address> addressList = ((java.util.List<ua.netcracker.controller.Address>) (addressService.findAllSetting()));
    if (addressList.isEmpty()) {
        return new org.springframework.http.ResponseEntity<java.util.List<ua.netcracker.controller.Address>>(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return new org.springframework.http.ResponseEntity<java.util.List<ua.netcracker.controller.Address>>(addressList, org.springframework.http.HttpStatus.OK);
}