private int toInteger(org.jackace.jawascriptexecutive.Executor.JawaObjectRef o) throws org.jackace.jawascriptexecutive.Executor.JawascriptRuntimeException {
    if ((o.object) instanceof java.lang.Double) {
        int magnitude = ((int) ((long) (java.lang.Math.floor(java.lang.Math.abs(((java.lang.Double) (o.object)))))));
        int sign = (((java.lang.Double) (o.object)) > 0) ? 1 : -1;
        return magnitude * sign;
    }
    throw new org.jackace.jawascriptexecutive.Executor.JawascriptRuntimeException("Not yet implemented conversion.");
}