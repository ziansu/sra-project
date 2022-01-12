@java.lang.Override
protected org.springframework.http.HttpStatus getStatus(com.naturalprogrammer.spring.lemon.exceptions.MultiErrorException ex) {
    return ex.getStatus();
}