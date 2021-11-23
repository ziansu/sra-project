@java.lang.Override
public boolean shoutUno() {
    if (((cards.size()) == 1) && ((java.lang.Math.random()) > 0.05)) {
        return super.shoutUno();
    }
    return false;
}