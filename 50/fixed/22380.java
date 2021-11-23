@java.lang.Override
public com.gabriel.missingdogpoc.Dog update(com.gabriel.missingdogpoc.Dog d) {
    list.remove(d);
    list.add(d);
    return d;
}