org.sbml.jsbml.SBase removeFromList(int index) {
    if (index == (-1))
        return null;
    
    org.sbml.jsbml.SBase id = memberList.get(index);
    list.remove(id);
    return memberList.remove(index);
}