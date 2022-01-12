@java.lang.Override
public java.lang.String eat(Thing thing) {
    java.lang.String m;
    java.lang.String cName = thing.getClass().getSimpleName();
    if (!(cName.equals("Thing"))) {
        m = (((toString()) + " won't eat a ") + (thing.getClass().getSimpleName())) + ".";
    }else {
        m = super.eat(thing);
    }
    return m;
}