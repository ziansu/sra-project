public void addVariable(@eu.mihosoft.vrl.annotation.ParamInfo(name = "Variable name ")
java.lang.String varName, @eu.mihosoft.vrl.annotation.ParamInfo(name = "Variable value ")
double varVal) {
    gcsc.vrl.pe_neuron.StoreValues var = new gcsc.vrl.pe_neuron.StoreValues(varName, varVal);
    if ((variables) == null) {
        variables = new java.util.ArrayList<gcsc.vrl.pe_neuron.StoreValues>();
    }
    variables.add(var);
}