@java.lang.Override
public void addReference(nl.uva.bromance.typechecking.ReferenceMap referenceMap) throws nl.uva.bromance.typechecking.TypeCheckingException {
    if (getIdentifier().isPresent()) {
        if (referenceMap.containsKey(getIdentifier())) {
            throw new nl.uva.bromance.typechecking.TypeCheckingException.AlreadyDefinedTypeCheckingException(this, getIdentifier().get());
        }else {
            referenceMap.put(getIdentifier().get(), this);
        }
    }else {
        throw new nl.uva.bromance.typechecking.TypeCheckingException.NoIdentifierDefinedTypeCheckingException(getLineNumber());
    }
}