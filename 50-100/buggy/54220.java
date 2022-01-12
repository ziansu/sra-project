@org.springframework.web.bind.annotation.RequestMapping(value = "/primaryAccount")
public java.lang.String primaryAccount(org.springframework.ui.Model model, java.security.Principal principal) {
    java.util.List<com.userfront.domain.PrimaryTransaction> primaryTransactionList = transactionService.findPrimaryTransactionList(principal.getName());
    com.userfront.domain.User user = userService.findByUsername(principal.getName());
    com.userfront.domain.PrimaryAccount primaryAccount = user.getPrimaryAccount();
    model.addAttribute("primaryAccount", primaryAccount);
    model.addAttribute("primaryTransactionList");
    return "primaryAccount";
}