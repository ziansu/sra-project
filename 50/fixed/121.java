@com.di.wang.payonline.controller.RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
public java.lang.String removeCart(@com.di.wang.payonline.controller.PathVariable(value = "id")
java.lang.Long id) {
    payCartService.removeCart(id);
    return "redirect:/cart/listall";
}