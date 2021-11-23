@java.lang.Deprecated
public void setDate(int date) {
    this.value = ((long) (org.teavm.classlib.java.util.TDate.setMonth(value, date)));
}