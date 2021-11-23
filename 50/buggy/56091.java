@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.Exception.class)
public java.lang.String hadleException(java.lang.Exception exception) {
    java.lang.System.out.println(exception.printStackTrace());
    java.lang.System.out.println("----Caught 333KeywordNotFoundException----");
    return "404Error";
}