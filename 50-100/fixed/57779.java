public void setObject(int parameterIndex, java.lang.Object x) {
    if (parameterIndex > (getParameterCount())) {
        de.hpi.hpcc.main.HPCCPreparedStatement.log(java.util.logging.Level.WARNING, (("The given index (" + parameterIndex) + ") is too high. Value will be ignored."));
    }else {
        parameters.put(parameterIndex, x);
    }
}