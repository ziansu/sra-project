@org.springframework.web.bind.annotation.RequestMapping(value = "/mcoupon")
public java.lang.String welcome(java.util.Map<java.lang.String, java.lang.Object> model) {
    issuingMCoupon();
    return "mcoupon";
}