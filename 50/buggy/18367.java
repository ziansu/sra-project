@cn.coolbhu.sfexpress.webcontroller.RequestMapping(value = "/deletechoose", method = RequestMethod.POST)
public java.lang.String deleteChoose(@cn.coolbhu.sfexpress.webcontroller.RequestParam(value = "cartid", required = false)
java.lang.String[] cartids) {
    int result = cartService.deleteChoose(cartids);
    return "redirect:/cart/all";
}