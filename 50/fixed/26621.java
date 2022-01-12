@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteAsset", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView deleteAsset(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Long id) {
    userService.deleteAsset(id);
    return new org.springframework.web.servlet.ModelAndView("redirect:/assetslist");
}