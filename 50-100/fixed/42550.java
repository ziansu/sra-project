@java.lang.Override
public statements.core.Resemblance resemble(statements.core.Verb otherVerb) {
    if (otherVerb == null) {
        return Resemblance.NONE;
    }
    if (getName().equals(otherVerb.getName())) {
        return Resemblance.FULL;
    }
    if ((isNegated()) == (otherVerb.isNegated())) {
        if (getLemma().equals(otherVerb.getLemma())) {
            return Resemblance.CLOSE;
        }
    }else {
    }
    return Resemblance.NONE;
}