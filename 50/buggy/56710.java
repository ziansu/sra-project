@java.lang.Override
public java.lang.String toString() {
    return (super.toString()) + (isDirectory() ? java.io.File.separatorChar : "");
}