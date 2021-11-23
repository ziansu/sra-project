@org.springframework.web.bind.annotation.RequestMapping(value = "/check_email/{email}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<fii.admission.users.Success> checkEmail(@org.springframework.web.bind.annotation.PathVariable(value = "email")
java.lang.String email) {
    fii.admission.users.User result = fii.admission.users.UserService.getUser(email);
    java.lang.System.out.println(result);
    if (result == null) {
        return new org.springframework.http.ResponseEntity<fii.admission.users.Success>(new fii.admission.users.Success(false), org.springframework.http.HttpStatus.NOT_FOUND);
    }else {
        return new org.springframework.http.ResponseEntity<fii.admission.users.Success>(new fii.admission.users.Success(true), org.springframework.http.HttpStatus.OK);
    }
}