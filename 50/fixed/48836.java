@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteMedicine.html", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String deleteMedicine(@org.jboss.logging.annotations.Param
int id) {
    this.medicine.deleteMedicine(id);
    return "redirect:/viewMedicine.html";
}