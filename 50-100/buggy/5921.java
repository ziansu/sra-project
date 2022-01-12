@java.lang.Override
public void perform() {
    boolean friendlyFire = myFaction.getFriendlyFire();
    myFaction.msg(TL.COMMAND_FRIENDLYFIRE_TOGGLED, fme.describeTo(myFaction, true), ((friendlyFire ? "en" : "dis") + "abled"));
    myFaction.setFriendlyFire((!friendlyFire));
}