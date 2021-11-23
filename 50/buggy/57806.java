@java.lang.Override
public void shootAt(iitema.gypsypokemon.elements.Color color, iitema.gypsypokemon.elements.Direction dir) {
    iitema.gypsypokemon.elements.blocks.SpecialWall.portalsField.put(color, this);
    iitema.gypsypokemon.elements.blocks.SpecialWall.portalsSide.put(color, dir.getOpposite());
}