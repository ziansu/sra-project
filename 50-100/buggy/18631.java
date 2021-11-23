@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof com.prog.tlc.btexchange.gestioneDispositivo.Node))
        return false;
    
    com.prog.tlc.btexchange.gestioneDispositivo.Node n = ((com.prog.tlc.btexchange.gestioneDispositivo.Node) (o));
    if ((this.nome.equals(n.getNome())) && (this.MACAddress.equals(n.getMACAddress())))
        return true;
    
    return false;
}