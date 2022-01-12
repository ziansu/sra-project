public java.lang.String login() {
    co.edu.unal.kwinty.BusinessLogic.Controller.LoginUser log = new co.edu.unal.kwinty.BusinessLogic.Controller.LoginUser();
    message = log.start(this.username, this.password);
    java.lang.System.out.println(("Este es el mensaje" + (message)));
    if ((message) != null) {
        return message;
    }else {
        return "welcome";
    }
}