@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/code")
public com.finance.controller.KaptchaController.CaptchaResopnse getKaptchaImageCode(javax.servlet.http.HttpSession session) {
    com.finance.controller.KaptchaController.CaptchaResopnse captchaResopnse = new com.finance.controller.KaptchaController.CaptchaResopnse();
    java.lang.String code = java.util.UUID.randomUUID().toString().replace("-", "");
    session.setAttribute(code, code);
    captchaResopnse.setCode(code);
    return captchaResopnse;
}