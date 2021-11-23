@org.springframework.web.bind.annotation.RequestMapping(value = "/divide/{st1}/{st2}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public double divideValues(@org.springframework.web.bind.annotation.PathVariable
java.lang.String st1, @org.springframework.web.bind.annotation.PathVariable
java.lang.String st2, org.springframework.ui.ModelMap model) {
    double d1 = java.lang.Double.parseDouble(st1);
    double d2 = java.lang.Double.parseDouble(st2);
    double result = d1 / d2;
    return result;
}