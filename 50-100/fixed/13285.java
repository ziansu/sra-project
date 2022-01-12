@io.github.cyxcode.freedom.controller.InitBinder
public void myInitBinder(org.springframework.web.bind.WebDataBinder dataBinder) {
    java.lang.Object target = dataBinder.getTarget();
    if (target == null) {
        return ;
    }
    if ((target.getClass()) == (io.github.cyxcode.freedom.model.ProductInfo.class)) {
        dataBinder.setValidator(productInfoValidator);
    }
}