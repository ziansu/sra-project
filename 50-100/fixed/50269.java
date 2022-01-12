@grupod.desapp.unq.edu.ar.controllers.PostMapping
public org.springframework.http.ResponseEntity checkout(@grupod.desapp.unq.edu.ar.controllers.RequestBody
grupod.desapp.unq.edu.ar.model.requests.Request request) {
    grupod.desapp.unq.edu.ar.model.cashregister.CashRegister register;
    try {
        register = cashRegisterService.checkout(request);
    } catch (grupod.desapp.unq.edu.ar.model.exceptions.NoCashRegisterAvailableException e) {
        e.printStackTrace();
        return org.springframework.http.ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No cash register available");
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return org.springframework.http.ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    return org.springframework.http.ResponseEntity.ok(register);
}