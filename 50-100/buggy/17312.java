@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof com.vistatec.ocelot.lqi.model.LQISeverity) {
        com.vistatec.ocelot.lqi.model.LQISeverity sevObj = ((com.vistatec.ocelot.lqi.model.LQISeverity) (obj));
        return (name.equals(sevObj.name)) && ((score) == (sevObj.score));
    }else {
        return super.equals(obj);
    }
}