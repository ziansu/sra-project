@java.lang.Override
public void resolveAnaphora() {
    java.util.List<org.tariel.pla.logics.Proposition> props = org.tariel.pla.logics.VariableStorage.getPopostionList();
    int i = 0;
    for (org.tariel.pla.logics.classic.CQuantifer quant : this.getQuantifers()) {
        if (i < (props.size()))
            props.get(i).setLinkedId(((java.lang.String) (quant.getVar().getSourceId())));
        
        i++;
    }
}