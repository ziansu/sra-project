private org.apache.commons.math3.linear.FieldVector<org.apache.commons.math3.complex.Complex> get_start_state() {
    org.apache.commons.math3.linear.FieldVector<org.apache.commons.math3.complex.Complex> state = new org.apache.commons.math3.linear.ArrayFieldVector<org.apache.commons.math3.complex.Complex>(org.apache.commons.math3.complex.ComplexField.getInstance(), ((int) (java.lang.Math.pow(2, qubits.length()))));
    state.setEntry(java.lang.Integer.parseInt(qubits), new org.apache.commons.math3.complex.Complex(1));
    return state;
}