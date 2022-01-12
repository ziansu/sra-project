@org.springframework.web.bind.annotation.RequestMapping(value = "/doc/vej")
public org.springframework.web.servlet.ModelAndView veje() {
    java.util.Map<java.lang.String, java.lang.Object> model = new java.util.HashMap<java.lang.String, java.lang.Object>();
    dk.magenta.databroker.dawa.model.vejstykker.VejstykkeEntity vejstykkeEntity = null;
    try {
        vejstykkeEntity = this.dawaModel.getVejstykke(101, 7064);
    } catch (java.lang.Exception e) {
    }
    model.put("uuid", (vejstykkeEntity != null ? vejstykkeEntity.getUuid() : "e9032c69-98bf-4e18-bc94-1a5e5f8901e4"));
    model.put("nav", "vej");
    return new org.springframework.web.servlet.ModelAndView("doc/vej", model);
}