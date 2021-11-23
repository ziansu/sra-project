public java.lang.String toJSONString() {
    java.lang.String output = "[";
    java.util.Collection<mhcs.model.Module> modList = getModules();
    for (mhcs.model.Module iterator : modList) {
        output += iterator.toJSONString();
        output += ",";
    }
    output = output.substring(0, ((output.length()) - 1));
    if ((output.length()) > 0) {
        output += "]";
    }
    return output;
}