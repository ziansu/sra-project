public static demo.kolorob.kolorobdemoversion.model.FInancial.FinancialServiceDetailsItem parseFinancialServiceDetailsItem(org.json.JSONObject jo) throws org.json.JSONException {
    int _finId = jo.getInt("id");
    java.lang.String _servicecost = jo.getString("financial_cost");
    java.lang.String _serviceremark = jo.getString("financial_remarks");
    java.lang.String _servicetype = jo.getJSONObject("financial_services").getString("type");
    java.lang.String _servicesubtype = jo.getJSONObject("financial_services").getString("sub_type");
    return new demo.kolorob.kolorobdemoversion.model.FInancial.FinancialServiceDetailsItem(_finId, _servicecost, _serviceremark, _servicetype, _servicesubtype);
}