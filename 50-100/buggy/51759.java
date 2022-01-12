@org.springframework.web.bind.annotation.RequestMapping(value = "/addparams", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String addOps(@org.springframework.web.bind.annotation.RequestParam(value = "val1")
java.lang.String val1, @org.springframework.web.bind.annotation.RequestParam(value = "val2")
java.lang.String val2) {
    com.rohan.www.mywebapp.MathOperations ops = new com.rohan.www.mywebapp.MathOperations();
    int val1FromParameter = java.lang.Integer.parseInt(val1);
    int val2FromParameter = java.lang.Integer.parseInt(val1);
    java.lang.Integer val = ops.addOperations(val1FromParameter, val2FromParameter).intValue();
    return val.toString();
}