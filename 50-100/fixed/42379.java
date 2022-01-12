@org.springframework.web.bind.annotation.RequestMapping(value = "/{businessId}/{storeName}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getCurrentRestaurant(@org.springframework.web.bind.annotation.PathVariable
int businessId, @org.springframework.web.bind.annotation.PathVariable
java.lang.String storeName, javax.servlet.http.HttpSession session) {
    java.lang.System.out.println(storeName);
    ita.o2o.dto.BusinessDto businessDto = new ita.o2o.dto.BusinessDto();
    businessDto.setId(businessId);
    businessDto.setName(storeName);
    session.setAttribute("currentRestaurant", businessDto);
    return "restaurant";
}