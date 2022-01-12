@java.lang.Override
public boolean add(edu.ce.sharif.twolru.db.datatypes.Page page) {
    if ((this.size()) == (DRAM_SIZE)) {
        (migToPcm)++;
        addToPcm(dram.get(0));
        dram.remove(((dram.size()) - 1));
        page.setHitCount(0L);
        dram.add(0, page);
        return true;
    }else
        add(0, page);
    
    return true;
}