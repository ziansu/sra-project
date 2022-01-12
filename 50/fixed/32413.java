@java.lang.Override
public java.util.stream.Stream<ch.waan.util.Result<java.lang.String>> attribute(java.lang.String name) {
    return this.elements.map(( e) -> ch.waan.util.Result.ofNullable(e.getAttribute(name)));
}