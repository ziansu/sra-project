public scala.Tuple2<scala.util.Either<java.util.Set<org.kframework.utils.errorsystem.ParseFailedException>, org.kframework.kore.K>, java.util.Set<org.kframework.utils.errorsystem.ParseFailedException>> parseString(java.lang.String input, org.kframework.kore.Sort startSymbol, org.kframework.attributes.Source source) {
    return parseString(input, startSymbol, source, 1, 1, true);
}