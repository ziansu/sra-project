@de.unifreiburg.cs.proglang.jgs.support.Constraints(value = { "HIGH <= @0 " , "@0 <= @ret" })
@de.unifreiburg.cs.proglang.jgs.support.Effects(value = { "LOW" })
static java.lang.String aStaticMethodWithCasts(java.lang.String i) {
    java.lang.String x = de.unifreiburg.cs.proglang.jgs.support.Casts.cast("HIGH ~> ?", i);
    java.lang.String result;
    if (i == null) {
        result = de.unifreiburg.cs.proglang.jgs.support.Casts.cast("? ~> LOW", x);
    }else {
        result = null;
    }
    return result;
}