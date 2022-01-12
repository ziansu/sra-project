@org.springframework.web.bind.annotation.RequestMapping
public void wechat(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    try {
        service(request, response, wxMpService);
    } catch (javax.servlet.ServletException e) {
        com.zoe.weiya.controller.CoreController.log.error("error", e);
        e.printStackTrace();
    } catch (java.io.IOException e) {
        com.zoe.weiya.controller.CoreController.log.error("error", e);
        e.printStackTrace();
    }
}