private io.parsingdata.metal.data.ParseResult parse(final java.lang.String scope, final long ref, final io.parsingdata.metal.data.Environment env, final io.parsingdata.metal.encoding.Encoding enc) throws java.io.IOException {
    if (env.order.hasGraphAtRef(ref)) {
        return new io.parsingdata.metal.data.ParseResult(true, new io.parsingdata.metal.data.Environment(env.order.add(new io.parsingdata.metal.data.ParseRef(ref, this)), env.input, env.offset));
    }
    return _op.parse(scope, new io.parsingdata.metal.data.Environment(env.order.addBranch(this), env.input, ref), enc);
}