@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if (obj instanceof org.liveontologies.owlapi.proof.util.MockProofNode<?>) {
        return member_.equals(((org.liveontologies.owlapi.proof.util.MockProofNode<?>) (obj)).member_);
    }
    return false;
}