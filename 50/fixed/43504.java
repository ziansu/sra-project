@java.lang.Override
public <B> B foldr(github.com.beenotung.javalib.Functional.IFunc<github.com.beenotung.javalib.Functional.Pair<A, B>, B> f, B acc) {
    return f.apply(github.com.beenotung.javalib.Functional.pair(head, tail.foldr(f, acc)));
}