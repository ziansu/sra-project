@org.springframework.web.bind.annotation.RequestMapping(value = "register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String registerUser(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam(value = "surname")
java.lang.String surname, @org.springframework.web.bind.annotation.RequestParam(value = "phone")
java.lang.String phone, @org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email, @org.springframework.web.bind.annotation.RequestParam(value = "password")
java.lang.String password) {
    beans.Users user = new beans.Users(name, surname, phone, email, password);
    org.springframework.jdbc.core.JdbcTemplate jdbcTemplate = new org.springframework.jdbc.core.JdbcTemplate(dataSource);
    jdbcTemplate.update("insert into InterUsers (name, surname, email, phone, pwd) values (?, ?, ?, ?, ?)", user.getName(), user.getSurname(), user.getEmail(), user.getPhone(), user.getPassword());
    return "redirect:/users/login" + "<font=green>Successful registry!You may now login!";
}