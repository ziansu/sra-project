@java.lang.Override
public java.lang.String describe(nightgames.combat.Combat c) {
    if (!(affected.human())) {
        return java.lang.String.format("%s looks impossibly beautiful to %s eyes, %s can't bear to hurt %s.", c.getOther(affected).subject(), affected.nameOrPossessivePronoun(), affected.subject(), c.getOther(affected).directObject());
    }
    return "";
}