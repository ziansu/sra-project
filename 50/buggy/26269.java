@java.lang.Override
public pl.ais.commons.bean.validation.Constraint<?, T> negate() {
    return new pl.ais.commons.bean.validation.constraint.SimpleConstraint(pl.ais.commons.bean.validation.constraint.SimpleConstraint.getNegatedName(), determinant);
}