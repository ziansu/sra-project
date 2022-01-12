@org.openjdk.jmh.annotations.Benchmark
@org.openjdk.jmh.annotations.CompilerControl(value = CompilerControl.Mode.EXCLUDE)
public boolean paramString() {
    return wrapper.paramString(bar);
}