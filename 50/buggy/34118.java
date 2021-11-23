public int selectInteger(cascading.tuple.Fields selector) {
    if (selector.isDefined())
        throw new cascading.tuple.TupleException("given selector must define a field name or position to select with");
    
    return tuple.getInteger(fields.getPos(selector.get(0)));
}