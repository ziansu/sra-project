@org.springframework.web.bind.annotation.RequestMapping(value = "/sign_in", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.TEXT_PLAIN_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String signIn(@org.springframework.web.bind.annotation.RequestBody
java.util.Map<java.lang.String, java.lang.String> requests) {
    com.webtrucking.controller.WalletControler.log.info("===== Start sign in wallet {}", requests);
    java.lang.String userName = requests.get("username").toString();
    java.lang.String password = requests.get("password").toString();
    java.util.Map profile = tmnWalletClient.signIn(userName, password);
    org.json.JSONObject jsonObject = com.webtrucking.util.JsonMapConverter.toJson(profile);
    com.webtrucking.controller.WalletControler.log.info("===== End sign in wallet");
    return jsonObject.toString();
}