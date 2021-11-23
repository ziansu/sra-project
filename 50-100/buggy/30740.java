@java.lang.Override
public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler, org.springframework.web.servlet.ModelAndView modelAndView) throws java.lang.Exception {
    if ((modelAndView != null) && (modelAndView.getViewName().startsWith("redirect:"))) {
        return ;
    }
    org.codetrip.common.vo.UserVO userVO;
    if ((userVO = ((org.codetrip.common.vo.UserVO) (request.getSession().getAttribute("currentUser")))) != null) {
        modelAndView.addObject("logined", true);
        modelAndView.addObject("nikename", userVO.getNikeName());
    }
}