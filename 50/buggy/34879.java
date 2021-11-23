public model.MathParser parse(java.lang.String parse, java.lang.String mem, int base) {
    setMem(mem);
    setBase(base);
    return parse(parse);
}