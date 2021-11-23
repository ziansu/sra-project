@org.openjdk.jmh.annotations.Benchmark
@org.openjdk.jmh.annotations.CompilerControl(value = CompilerControl.Mode.EXCLUDE)
public boolean testParamString() {
    return wrapper.paramString(bar);
}