protected void parseOrigOrderListToMethodList(java.util.List<java.lang.String> origOrder, java.util.Map<java.lang.String, edu.washington.cs.dt.impact.data.TestFunctionStatement> nameToMethodData) {
    methodList.clear();
    for (java.lang.String line : origOrder) {
        if (nameToMethodData.containsKey(line)) {
            methodList.add(nameToMethodData.get(line));
        }
    }
}