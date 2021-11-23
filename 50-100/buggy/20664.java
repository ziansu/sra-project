@org.springframework.web.bind.annotation.RequestMapping(value = "modCommodity", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.ms.tools.entity.Result modCommodity(com.ms.dao.vo.CommodityVo commodityVo) {
    com.ms.dao.model.User user = ((com.ms.dao.model.User) (httpSession.getAttribute(RedisEnum.USER_SESSION_BIZ.getValue())));
    com.ms.dao.vo.CommodityVo commodityVo = new com.ms.dao.vo.CommodityVo();
    commodityVo.setUnwarehouse(cid);
    commodityVo.setUnwarehouse(stock);
    commodityVo.setSupplierId(user.getId());
    commodityVo.setPrice(price);
    commodityService.modStockOrPrice(commodityVo);
    return com.ms.tools.entity.Result.success("修改成功");
}