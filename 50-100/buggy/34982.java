@java.lang.Override
public at.searles.math.Cplx fromJSON(java.lang.Object o) throws org.json.JSONException {
    if (o instanceof org.json.JSONArray) {
        org.json.JSONArray arr = new org.json.JSONArray();
        double re = arr.getDouble(0);
        double im = arr.getDouble(1);
        return new at.searles.math.Cplx(re, im);
    }
    throw new org.json.JSONException("Array expected");
}