@controller.RequestMapping(value = helper.EndPoint.RENDER_IMAGE_BY_ORIGINAL_SIZE, method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView originalSize() {
    final org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView(INDEX_PAGE);
    setModelAttribute(modelAndView);
    modelAndView.addObject(ModelAttributePoint.ORIGINAL_IMAGE_SIZE, true);
    return modelAndView;
}