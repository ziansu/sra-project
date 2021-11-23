@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String index() {
    try {
    } catch (java.lang.Exception e) {
        etn.minegame.utils.Reporter.log(e);
    }
    return etn.minegame.constant.ViewName.INDEX_USER;
}