@org.springframework.web.bind.annotation.RequestMapping(value = "/register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void registProductPOST(web.portfolio.domain.ProductVO vo) throws java.lang.Exception {
    web.portfolio.controller.MainController.logger.info(vo.toString());
    java.lang.System.out.println(("vo.toString() : " + (vo.toString())));
    prod_service.createProduct(vo);
}