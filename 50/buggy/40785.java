protected com.stellaris.Type getType() {
    if ((!(list.isEmpty())) && (Type.COLOR.equals(list.iterator().next().getType()))) {
        return com.stellaris.Type.COLORLIST;
    }
    return com.stellaris.Type.LIST;
}