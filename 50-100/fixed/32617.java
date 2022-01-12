private boolean checkParamTypes(java.lang.Class[] writableParams, org.apache.tajo.common.TajoDataTypes[] tajoParams) {
    int i = 0;
    if ((writableParams.length) != (tajoParams.length)) {
        return false;
    }
    for (java.lang.Class writable : writableParams) {
        try {
            if (!(org.apache.tajo.plan.util.WritableTypeConverter.convertWritableToTajoType(writable).equals(tajoParams[(i++)]))) {
                return false;
            }
        } catch (org.apache.tajo.plan.function.UnsupportedDataTypeException e) {
            throw new org.apache.tajo.plan.function.TajoRuntimeException(e);
        }
    }
    return true;
}