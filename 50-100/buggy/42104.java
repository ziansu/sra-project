@org.springframework.web.bind.annotation.RequestMapping(params = "find=Next")
public java.lang.String findNextBabySittings(org.springframework.data.domain.Pageable pageable, org.springframework.ui.Model uiModel, javax.servlet.http.HttpServletResponse response) {
    response.setHeader("Cache-Control", "private, max-age=0, no-cache");
    org.springframework.data.domain.Page<com.appspot.gardemallorie.domain.BabySitting> babySittings = babySittingService.findNextBabySittings(pageable);
    uiModel.addAttribute("babysittings", babySittings.getContent());
    uiModel.addAttribute("maxPages", babySittings.getTotalPages());
    addDateTimeFormatPatterns(uiModel);
    return com.appspot.gardemallorie.web.BabySittingController.BABYSITTING_LIST_VIEW;
}