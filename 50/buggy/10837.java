public static void main(java.lang.String[] args, eta.runtime.stg.Closure mainClosure) {
    eta.runtime.RuntimeOptions.parse(args);
    eta.runtime.Runtime.evalLazyIO(cap, mainClosure);
    eta.runtime.Runtime.exit();
}