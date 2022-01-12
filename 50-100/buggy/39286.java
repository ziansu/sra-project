@java.lang.Override
protected com.example.haticesigirci.payment.FilterResults performFiltering(java.lang.CharSequence constraint) {
    com.example.haticesigirci.payment.FilterResults results = new com.example.haticesigirci.payment.FilterResults();
    if (constraint != null) {
        resultList = getAutoComplete(constraint.toString());
        android.util.Log.d("insideIfconstraint", "insideIfConstraint");
        android.util.Log.d("insideIfresult", "insideIfresult");
        results.count = resultList.size();
        results.values = resultList;
    }
    return results;
}