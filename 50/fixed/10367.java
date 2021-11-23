@java.lang.Override
public void put(double value) throws java.io.IOException {
    this.writer.write(java.lang.Double.toString(value));
    this.writer.write('\n');
}