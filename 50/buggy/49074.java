@org.springframework.web.bind.annotation.RequestMapping(value = { "/index" , "/" })
public java.lang.String index() {
    java.lang.System.out.println("here");
    return "list";
}