@java.lang.Override
public org.apache.hadoop.io.Text getCurrentValue() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.System.out.println("Current value: ");
    java.lang.System.out.println(value);
    return value;
}