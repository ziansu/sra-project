@org.springframework.web.bind.annotation.RequestMapping(path = "/live_edit")
public java.lang.String openEditor(@org.springframework.web.bind.annotation.RequestParam
java.lang.Long pageId) {
    return "admin/editor";
}