@java.lang.Override
public net.dv8tion.jda.JDA buildBlocking() throws java.lang.IllegalArgumentException, java.lang.InterruptedException, javax.security.auth.login.LoginException {
    login();
    return super.buildBlocking();
}