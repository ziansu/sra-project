@org.springframework.web.bind.annotation.RequestMapping(value = "/order")
public java.lang.String createOrder() {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    java.lang.String username = auth.getName();
    java.lang.String loggedInUsername = username;
    com.niit.illuminatebe.model.Customer customer = customerService.getUserByUserName(loggedInUsername);
    return "redirect:/checkout?userId=" + (customer.getId());
}