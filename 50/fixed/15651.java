@controller.RequestMapping(value = helper.EndPoint.SET_IMAGE_COUNT_IN_ROW, method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView imageCountInRow(@controller.PathVariable
int imageCountInRow) {
    final org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView(INDEX_PAGE);
    modelAndView.addObject(ModelAttributePoint.IMAGE_COUNT_IN_ROW, imageCountInRow);
    setModelAttribute(modelAndView);
    return modelAndView;
}