@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/code")
public com.finance.controller.KaptchaController.CaptchaResopnse getKaptchaImageCode() {
    com.finance.controller.KaptchaController.CaptchaResopnse captchaResopnse = new com.finance.controller.KaptchaController.CaptchaResopnse();
    java.lang.String code = java.util.UUID.randomUUID().toString().replace("-", "");
    org.springframework.web.context.request.ServletRequestAttributes attr = ((org.springframework.web.context.request.ServletRequestAttributes) (org.springframework.web.context.request.RequestContextHolder.currentRequestAttributes()));
    javax.servlet.http.HttpSession session = attr.getRequest().getSession();
    session.setAttribute(code, code);
    captchaResopnse.setCode(code);
    return captchaResopnse;
}