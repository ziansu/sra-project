@org.springframework.web.bind.annotation.RequestMapping(value = "/detail")
public java.lang.String detail(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model) {
    int id = 0;
    try {
        id = java.lang.Integer.parseInt(request.getParameter("goodsId"));
    } catch (java.lang.Exception e) {
        return "redirect:/";
    }
    com.parknshop.bean.GoodsDbBean goods = mOwnerService.getGoods(id);
    if (null == goods) {
        return "redirect:/";
    }
    java.util.List<com.parknshop.entity.OrdersEntity> comment = commentService.listComment(id);
    model.addAttribute("comments", comment);
    request.setAttribute(com.parknshop.controller.GoodsController.KEY_GOODS, goods);
    return "goods/goods.jsp";
}