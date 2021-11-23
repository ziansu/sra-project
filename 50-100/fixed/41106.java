@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    tudelft.ti2806.pl3.data.label.Label label = ((tudelft.ti2806.pl3.data.label.Label) (o));
    return text.equals(label.text);
}