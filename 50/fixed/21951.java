@org.springframework.web.bind.annotation.RequestMapping(value = "/find_by_tab_name", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<com.vsquaresystem.safedeals.amenitycode.AmenityCode> findByTabName(@org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name) {
    return amenityCodeDAL.findByTabName(name);
}