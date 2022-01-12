@io.github.cyxcode.freedom.controller.InitBinder
public void myInitBinder(org.springframework.web.bind.WebDataBinder dataBinder) {
    java.lang.Object target = dataBinder.getTarget();
    if (target == null) {
        return ;
    }
    java.lang.System.out.println(("Target=" + target));
    if ((target.getClass()) == (io.github.cyxcode.freedom.model.CartInfo.class)) {
    }else
        if ((target.getClass()) == (io.github.cyxcode.freedom.model.CustomerInfo.class)) {
            dataBinder.setValidator(customerInfoValidator);
        }
    
}