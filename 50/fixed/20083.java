private JavaFile.Term toBigInteger(wyjc.core.JavaFile.Term term, wyjc.builder.Type type) {
    return new wyjc.core.JavaFile.Invoke(null, new java.lang.String[]{ "BigInteger" , "valueOf" }, term);
}