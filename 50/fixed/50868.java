@org.openjdk.jmh.annotations.Benchmark
public java.util.List<java.lang.String> simple() {
    lineIdx = ((lineIdx) + 1) % (lines.length);
    return simple.parse(lines[lineIdx]);
}