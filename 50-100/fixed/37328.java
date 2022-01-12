@fr.epita.sigl.mepa.front.controller.admin.RequestMapping(value = { "/admin/addAmount" }, method = { RequestMethod.POST })
public java.lang.String addAmount(@fr.epita.sigl.mepa.front.controller.admin.RequestParam(value = "amount")
java.lang.String amount) {
    java.lang.Integer adding = 0;
    (clicks)++;
    try {
        adding = java.lang.Integer.parseInt(amount);
    } catch (java.lang.Exception e) {
        return "/invalid";
    }
    if (adding > 0) {
        totalAmount += adding;
    }
    return "/invalid";
}