@org.springframework.web.bind.annotation.RequestMapping(value = "/findById", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public com.primeton.ranxing.productapi.entity.Product findOne(@org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Long id);