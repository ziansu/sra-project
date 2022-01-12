@java.lang.Override
public java.lang.String getMessage() {
    if ((e) instanceof cz.upol.vanusanik.paralang.runtime.PLClass) {
        cz.upol.vanusanik.paralang.runtime.PLClass c = ((cz.upol.vanusanik.paralang.runtime.PLClass) (e));
        cz.upol.vanusanik.paralang.plang.PLangObject runnable = c.__getkey(BaseException.__messageGetter);
        if (runnable != null) {
            cz.upol.vanusanik.paralang.plang.PLangObject str = cz.upol.vanusanik.paralang.runtime.PLRuntime.getRuntime().run(runnable, c);
            return str.toString(str);
        }
    }
    return e.getMessage();
}