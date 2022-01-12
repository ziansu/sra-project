@java.lang.Override
public ch.kerbtier.helene.entities.Entity get(java.lang.String name) {
    if ((name.length()) == 0) {
        return this;
    }
    if ((name.indexOf(".")) != (-1)) {
        return getByPath(name);
    }
    ch.kerbtier.helene.entities.Entity e = map.get(name);
    if (e == null) {
        throw new ch.kerbtier.helene.exceptions.UndefinedFieldException(((("field " + name) + " does not exist in ") + (this)));
    }
    return e;
}