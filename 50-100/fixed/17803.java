@org.springframework.web.bind.annotation.RequestMapping(value = "/addProductToCart", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public cn.edu.swpu.cins.dto.http.HttpResult<cn.edu.swpu.cins.dto.view.CartVo> addProductToCart(javax.servlet.http.HttpSession session, java.lang.Integer productId, java.lang.Integer count) {
    cn.edu.swpu.cins.entity.User user = ((cn.edu.swpu.cins.entity.User) (session.getAttribute(Const.CURRENT_USER)));
    if (user == null) {
        return cn.edu.swpu.cins.dto.http.HttpResult.createByErrorCodeMessage(HttpResultEnum.NEED_LOGIN.getCode(), HttpResultEnum.NEED_LOGIN.getDescrption());
    }
    return cartService.add(user.getId(), productId, count);
}