public void setLevelCagesMap(java.util.List<java.util.List<entity.CageEntity>> cagesMap) {
    for (int i = 0; i < (cagesMap.size()); i++) {
        this.level.cagesMap.add(i, cagesMap.get(i));
        if ((i + 1) == (this.nbLevel))
            this.level.setCagesInLevel(cagesMap.get(i));
        
    }
}