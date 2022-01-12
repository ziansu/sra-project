@java.lang.Override
public void setColor(java.lang.String color) {
    ClientModelRoot._instance.setColor(color);
    ClientModelRoot._instance.notifyAll();
}