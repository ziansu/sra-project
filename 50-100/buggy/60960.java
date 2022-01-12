@org.springframework.web.bind.annotation.RequestMapping(value = "/add", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String add(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    org.yxm.jundui.model.User loginUser = getLoginUser(request);
    if (loginUser == null) {
        return "redirect:/login";
    }
    org.yxm.jundui.web.dto.TrainDto trainDto = new org.yxm.jundui.web.dto.TrainDto();
    model.addAttribute("trainDto", trainDto);
    initAdd(model, loginUser.getGroup().getId());
    return "train/edit";
}