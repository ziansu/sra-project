@org.springframework.web.bind.annotation.RequestMapping(value = "/primaryAccount")
public java.lang.String primaryAccount(org.springframework.ui.Model model, java.security.Principal principal) {
    java.util.List<com.userfront.controller.PrimaryTransaction> primaryTransactionList = transactionService.findPrimaryTransactionList();
    com.userfront.controller.User user = userService.findByUsername(principal.getName());
    com.userfront.controller.PrimaryAccount primaryAccount = user.getPrimaryAccount();
    model.addAttribute("primaryAccount", primaryAccount);
    model.addAttribute("primaryTransactionList", primaryTransactionList);
    return "primaryAccount";
}