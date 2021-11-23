@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String saveCar(main.java.walsh.springwebapps.data.CarForm form, org.springframework.ui.Model model) throws java.lang.Exception {
    carRepository.saveCar(new main.java.walsh.springwebapps.data.Car(null, form.getMake(), form.getModel(), form.getColor(), form.getMileage(), form.getYear(), form.getEngineSize(), form.getFuelType(), form.getDescription(), form.getPrice(), new java.util.Date()));
    return "redirect:/cars";
}