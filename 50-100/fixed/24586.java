@java.lang.Override
public void eat(Thing thing) {
    java.lang.String cName = thing.getClass().getSimpleName();
    if (!(cName.equals("Thing"))) {
        java.lang.System.out.println(((((this.toString()) + " won't eat a ") + (thing.toString())) + "."));
    }else {
        super.eat(thing);
    }
}