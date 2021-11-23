@java.lang.Override
public void setUser(shared.classes.User user) {
    ClientModelRoot._instance.setUser(user);
    ClientModelRoot._instance.notifyAll();
}