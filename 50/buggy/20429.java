@org.springframework.web.bind.annotation.RequestMapping(value = "page", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.data.domain.Page<com.primeton.ranxing.productapi.entity.Product> findOne(@org.springframework.web.bind.annotation.RequestParam
int page, @org.springframework.web.bind.annotation.RequestParam
int size, @org.springframework.web.bind.annotation.RequestParam
java.util.List<java.lang.String> properties);