@java.lang.Override
public void onRequestedWrite(java.lang.String newJvmName, java.lang.String oldJvmName) {
    strings.add((("CL: ".concat(newJvmName).concat(" ").concat(oldJvmName)) + "\n"));
}