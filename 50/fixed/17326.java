@java.lang.Override
public void setNewNumber(java.lang.Integer queryNumber) throws java.io.IOException {
    write("num.seq", queryNumber.toString());
}