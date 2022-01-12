@java.lang.Override
public ea.internal.phy.PhysikHandler typ(ea.Physik.Typ typ) {
    if (typ == (physikTyp)) {
        return this;
    }
    ea.internal.phy.BodyType newType = typ.convert();
    body.setType(newType);
    body.setActive(true);
    fixture.setSensor((typ == (Physik.Typ.PASSIV)));
    body.setGravityScale((typ == (Physik.Typ.PASSIV) ? 0 : 1));
    return this;
}