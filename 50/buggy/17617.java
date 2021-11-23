@java.lang.Override
public void tick() {
    (temp)++;
    expired = ((temp) > 10) ? true : false;
}