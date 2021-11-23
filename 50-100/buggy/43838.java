@org.springframework.web.bind.annotation.RequestMapping(value = "/logincheck", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.lang.String> logincheck(java.lang.String id, java.lang.String passwd) throws java.lang.Exception {
    com.hyucs.academic.domain.UserVO vo = service.loginCheck(id);
    if (passwordEncoder.matches(passwd, vo.getUpw())) {
        return new org.springframework.http.ResponseEntity<java.lang.String>("SUCCESS", org.springframework.http.HttpStatus.OK);
    }else {
        return new org.springframework.http.ResponseEntity<java.lang.String>("FAIL", org.springframework.http.HttpStatus.OK);
    }
}