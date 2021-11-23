@org.springframework.web.bind.annotation.ExceptionHandler(value = { java.lang.Exception.class })
public void handleException(java.lang.Exception e) {
    java.lang.System.out.println(e.getMessage());
    e.printStackTrace(java.lang.System.out);
}