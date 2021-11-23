public void fireBomb(samueltaylor.classicwarlordprototype.Model.Region r, java.util.List<samueltaylor.classicwarlordprototype.Model.Empire> affectedEmpires, java.util.List<samueltaylor.classicwarlordprototype.Model.Region> affectedRegions) {
    location.setBomb(null);
    location = r;
    if ((r.getBomb()) != null) {
        this.bombtype = location.getBomb().getBombtype();
    }
    location.setBomb(this);
    location.detonateBomb(affectedEmpires, affectedRegions);
}