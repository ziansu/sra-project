@org.springframework.web.bind.annotation.RequestMapping(value = "cancelbooktour/{idBT}/{idTour}")
public java.lang.String cancelBookTour(@org.springframework.web.bind.annotation.PathVariable(value = "idBT")
java.lang.Integer idBT, @org.springframework.web.bind.annotation.PathVariable(value = "idBT")
int idTour) {
    bookTourService.cancelBookTour(idBT, idTour);
    return "redirect:/tourlist";
}