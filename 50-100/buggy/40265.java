@org.springframework.web.bind.annotation.RequestMapping(value = "/update_promotion/{idTour}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processForm(@org.springframework.web.bind.annotation.RequestParam(value = "fromDate")
java.util.Date fromDate, @org.springframework.web.bind.annotation.RequestParam(value = "toDate")
java.util.Date toDate, @org.springframework.web.bind.annotation.RequestParam(value = "percent")
int percent, @org.springframework.web.bind.annotation.PathVariable(value = "idTour")
int idTour) {
    edu.ctu.thesis.travelsystem.controller.PromotionController.logger.info(("Updating promotion with id tour: " + idTour));
    edu.ctu.thesis.travelsystem.model.Tour tour = tourService.findTourById(idTour);
    tour.getPromotion().setPercent(percent);
    tour.getPromotion().setFromDate(fromDate);
    tour.getPromotion().setToDate(toDate);
    tourService.updateTour(tour);
    return "redirect:/managetour";
}