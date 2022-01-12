@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> asReportParameter() {
    if (!(de.interseroh.report.model.MultiSelectParameter.isUnset())) {
        final java.util.List values = new java.util.ArrayList();
        for (T value : getValue()) {
            values.add(de.interseroh.report.model.MultiSelectParameter.asObject(asString(value)));
        }
        return new java.util.HashMap<java.lang.String, java.lang.Object>() {
            {
                put(getName(), values.toArray());
            }
        };
    }else {
        return super.asReportParameter();
    }
}