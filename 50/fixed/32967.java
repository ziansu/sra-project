@org.springframework.web.bind.annotation.RequestMapping(value = "cancelbooktour/{idBT}")
public java.lang.String cancelBookTour(@org.springframework.web.bind.annotation.PathVariable(value = "idBT")
java.lang.Integer idBT) {
    bookTourService.cancelBookTour(idBT);
    return "redirect:/tourlist";
}