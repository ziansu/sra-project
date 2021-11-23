@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.cegekaschool.domain.secret.Secret> getSecrets() {
    secretService.addSecret(new com.cegekaschool.domain.secret.Secret(new com.cegekaschool.domain.pineapple.Pineapple("roel", "Goossens"), new com.cegekaschool.domain.photo.Photo("c/lol")));
    return new java.util.ArrayList<com.cegekaschool.domain.secret.Secret>(secretService.getAllSecrets());
}