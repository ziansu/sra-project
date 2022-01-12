private org.springframework.web.servlet.ModelAndView getModel(org.springframework.web.servlet.ModelAndView mv, java.lang.String out) {
    if ((org.apache.commons.lang.StringUtils.isNotEmpty(out)) && (out.equalsIgnoreCase("out"))) {
        mv.addObject("title", "出库");
        mv.addObject("isout", true);
    }else {
        mv.addObject("title", "入库");
        mv.addObject("isout", false);
    }
    return mv;
}