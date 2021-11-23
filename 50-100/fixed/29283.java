@org.springframework.web.bind.annotation.RequestMapping(path = "/userInfo", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String userInfoPage(javax.servlet.http.HttpSession session, org.springframework.ui.Model model) {
    int userId = ((int) (session.getAttribute("userId")));
    com.paypal.dealbridge.domain.UserFullInfo ufi = userInfoService.getUserInfo(userId);
    java.util.List<com.paypal.dealbridge.storage.domain.Bank> bankList = bankService.getBankList();
    model.addAttribute("ufi", ufi);
    model.addAttribute("userId", userId);
    model.addAttribute("bankList", bankList);
    return "selfInfo";
}