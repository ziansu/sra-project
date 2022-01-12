@java.lang.Override
public void copyTo(org.gradoop.benchmark.patternmatching.cypher.expand.ExpandRecord target) {
    if (((target.path) == null) || ((target.path.length) < (this.path.length))) {
        target.path = new byte[this.path.length];
    }
    java.lang.System.arraycopy(this.path, 0, target.path, 0, this.path.length);
}