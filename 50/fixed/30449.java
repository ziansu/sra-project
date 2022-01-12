@java.lang.Override
public com.planet_ink.coffee_mud.Areas.TimeClock getTimeObj() {
    final com.planet_ink.coffee_mud.Areas.Area shipItemArea = getShipItemArea();
    return (shipItemArea != null) && (shipItemArea != (this)) ? shipItemArea.getTimeObj() : com.planet_ink.coffee_mud.Areas.CMLib.time().globalClock();
}