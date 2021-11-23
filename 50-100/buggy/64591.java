@org.springframework.web.bind.annotation.RequestMapping(value = "/passengers", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
public java.lang.String passengers() {
    java.util.Map<java.lang.String, java.lang.Object> aMap = new java.util.HashMap<java.lang.String, java.lang.Object>();
    aMap.put("result", "OK");
    org.hibernate.Session session = getSession();
    bd2.Muber.model.Passenger passenger = ((bd2.Muber.model.Passenger) (session.get(bd2.Muber.model.Passenger.class, 2)));
    bd2.Muber.DTO.PassengerDTO pdto = new bd2.Muber.DTO.PassengerDTO(passenger);
    java.lang.System.out.println(pdto);
    aMap.put("resultingObject", pdto);
    return new com.google.gson.Gson().toJson(aMap);
}