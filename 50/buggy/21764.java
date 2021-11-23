@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public hello.WebhookResponse webhook(@org.springframework.web.bind.annotation.RequestBody
java.lang.String obj) {
    java.lang.System.out.println(obj);
    return new hello.WebhookResponse(("Hello! " + obj), ("Text " + obj));
}