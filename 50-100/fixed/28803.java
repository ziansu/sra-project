public java.util.ArrayList<java.lang.String> getBasicOutput(java.lang.String key) {
    java.util.HashMap<java.lang.Long, edu.rice.seclab.dso.StringInfo> si_hm = myStringInfoMap.get(key);
    java.util.ArrayList<java.lang.String> output = new java.util.ArrayList<java.lang.String>();
    for (edu.rice.seclab.dso.StringInfo bsi : si_hm.values()) {
        java.lang.String s = bsi.toBasicOutput();
        if ((s.length()) > 0)
            output.add(s);
        
    }
    java.util.Collections.sort(output);
    return output;
}