private boolean isHyperValentMolecule(chemia.httpsgithub.comahyoung1.chemia.Element centerAtom, chemia.httpsgithub.comahyoung1.chemia.Element[] attachedAtoms) {
    if ((centerAtom.getCanHaveExpandedOctet()) && ((attachedAtoms.length) > 4)) {
        return true;
    }else
        if ((attachedAtoms.length) > 4) {
        }else {
            return false;
        }
    
}