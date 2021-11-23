@de.unifreiburg.cs.proglang.jgs.support.Constraints(value = { "HIGH <= @0 " , "@0 <= @ret" })
@de.unifreiburg.cs.proglang.jgs.support.Effects(value = {  })
static java.lang.String aStaticMethodWithCasts(java.lang.String i) {
    java.lang.String x = de.unifreiburg.cs.proglang.jgs.support.Casts.cast("HIGH ~> ?", i);
    java.lang.String result;
    if (i == null) {
        java.lang.System.out.println("Attempting that illegal cast!");
        result = de.unifreiburg.cs.proglang.jgs.support.Casts.cast("? ~> LOW", x);
    }else {
        result = null;
    }
    return result;
}