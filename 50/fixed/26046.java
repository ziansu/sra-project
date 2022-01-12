@org.cafebabepy.annotation.DefineCafeBabePyFunction(name = __str__)
public org.cafebabepy.runtime.PyObject __str__(org.cafebabepy.runtime.PyObject self) {
    return this.runtime.str(self.asJavaString());
}