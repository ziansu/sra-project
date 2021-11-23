private void quitarTagArbol(com.PubliciBot.DM.ArbolTags arbolTags, com.PubliciBot.DM.Tag tag) {
    java.util.ArrayList<com.PubliciBot.DM.Tag> hijos = buscarTagPorPadre(arbolTags, tag);
    for (com.PubliciBot.DM.Tag tagtemp : hijos) {
        quitarTagArbol(arbolTags, tagtemp);
        arbolTags.getTags().remove(tagtemp);
    }
    arbolTags.getTags().remove(tag);
}