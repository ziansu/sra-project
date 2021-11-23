@java.lang.Override
public int addVariable() {
    return jnisat.JPicoSat.picosat_inc_max_var(handle, ((byte) (0)));
}