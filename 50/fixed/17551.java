@org.springframework.web.bind.annotation.CrossOrigin(origins = "http://localhost:8800")
@org.springframework.web.bind.annotation.RequestMapping(value = "/addCar", method = org.springframework.web.bind.annotation.RequestMethod.POST, headers = "Accept=application/json")
public void addCar(@org.springframework.web.bind.annotation.RequestBody
bean.Car car) {
    carService.addCar(car);
}