@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.HashSet<com.cegekaschool.domain.secret.Secret> getSecrets() {
    return secretService.getAllSecrets();
}